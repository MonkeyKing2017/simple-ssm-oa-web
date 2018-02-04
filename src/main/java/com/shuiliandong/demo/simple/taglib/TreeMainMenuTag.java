package com.shuiliandong.demo.simple.taglib;

import com.shuiliandong.demo.simple.model.LeftMenuMO;
import org.apache.log4j.Logger;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.List;

public class TreeMainMenuTag extends SimpleTagSupport {
    private static Logger logger = Logger.getLogger(TreeMainMenuTag.class);

    private LeftMenuMO leftMenuMO;

    private String baseUrl;

    @Override
    public void doTag() throws JspException, IOException {
        List<LeftMenuMO.TreeNoteMO> result = leftMenuMO.getResult();
        if (leftMenuMO == null || CollectionUtils.isEmpty(result)) {
            throw new RuntimeException("数据为空，请不要逗我。");
        }

        int level = 0;
        StringBuffer resultStr = new StringBuffer("");
        for (LeftMenuMO.TreeNoteMO treeNoteMO : result) {
            resultStr.append(LeftMenuMO.Contants.FIRST_MENU_PREFIX);
            getOutString(treeNoteMO, level, resultStr);
            resultStr.append(LeftMenuMO.Contants.FIRST_MENU_SUFFIX);
        }
        JspWriter out = getJspContext().getOut();
        out.print(resultStr.toString());
    }

    private void getOutString(LeftMenuMO.TreeNoteMO treeNoteMO, int level, StringBuffer resultStr) {
        level += 1;
        // 获得到类型
        LeftMenuMO.Type type = LeftMenuMO.Type.getTypeByCode(treeNoteMO.getType());
        switch (type) {
            case FILE:
                execFile(treeNoteMO, level, resultStr);
                break;
            case EX_FILE:
                execExFile(treeNoteMO, level, resultStr);
                break;
            case CATEGORY:
                execCategory(treeNoteMO, level, resultStr);
                break;
            default:
                execFile(treeNoteMO, level, resultStr);
                break;
        }
    }

    private void getOutStringByList(List<LeftMenuMO.TreeNoteMO> treeNoteMOList, int level, StringBuffer resultStr) {
        for (LeftMenuMO.TreeNoteMO treeNoteMO : treeNoteMOList) {
            resultStr.append(LeftMenuMO.Contants.LI_PREFIX);
            getOutString(treeNoteMO, level, resultStr);
            resultStr.append(LeftMenuMO.Contants.LI_SUFFIX);
        }
    }

    private void execFile(LeftMenuMO.TreeNoteMO treeNoteMO, int level, StringBuffer resultStr) {
        if (StringUtils.isEmpty(baseUrl)) {
            baseUrl = "";
        }
        // 拼接节点属性
        String url = baseUrl+treeNoteMO.getUrl();
        String icon = String.format(LeftMenuMO.Contants.ICON_FORMAT, "cogs");
        String title = level > 1 ? treeNoteMO.getShowName() : String.format(LeftMenuMO.Contants.TITLE_FORMAT, treeNoteMO.getShowName());
        String content = level > 1 ? title : icon + title;
        String a = String.format(LeftMenuMO.Contants.A_FORMAT, url, content);
        resultStr.append(a);
    }

    private void execExFile(LeftMenuMO.TreeNoteMO treeNoteMO, int level, StringBuffer resultStr) {
        // 拼接节点属性
        String url = treeNoteMO.getUrl();
        String icon = String.format(LeftMenuMO.Contants.ICON_FORMAT, "cogs");
        String title = level > 1 ? treeNoteMO.getShowName() : String.format(LeftMenuMO.Contants.TITLE_FORMAT, treeNoteMO.getShowName());
        String content = level > 1 ? title : icon + title;
        String a = String.format(LeftMenuMO.Contants.A_FORMAT, url, content);
        resultStr.append(a);
    }

    private void execCategory(LeftMenuMO.TreeNoteMO treeNoteMO, int level, StringBuffer resultStr) {
        // 拼接节点属性
        String url = LeftMenuMO.Contants.JAVASCRIPT_FORMAT;
        String icon = String.format(LeftMenuMO.Contants.ICON_FORMAT, "cogs");
        String title = level > 1 ? treeNoteMO.getShowName() : String.format(LeftMenuMO.Contants.TITLE_FORMAT, treeNoteMO.getShowName());
        String arrow = LeftMenuMO.Contants.ARROW_FORMAT;
        String content = level > 1 ? title + arrow : icon + title + arrow;
        String a = String.format(LeftMenuMO.Contants.A_FORMAT, url, content);
        // 目录生成节点内容
        resultStr.append(a);
        // 目录生成子节点前缀
        resultStr.append(LeftMenuMO.Contants.SUB_MENU_PREFIX);
        // 目录生成子节点内容
        getOutStringByList(treeNoteMO.getChildList(), level, resultStr);
        // 目录生成子节点后缀
        resultStr.append(LeftMenuMO.Contants.SUB_MENU_SUFFIX);
    }

    public void setLeftMenuMO(LeftMenuMO leftMenuMO) {
        this.leftMenuMO = leftMenuMO;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }
}
