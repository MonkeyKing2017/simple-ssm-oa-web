package com.shuiliandong.demo.simple.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeftMenuMO implements Serializable {
    private static final long serialVersionUID = -4607131531017433076L;

    public static class TreeNoteMO implements Serializable {
        private static final long serialVersionUID = -6712472509094673683L;

        private Long id;
        private Long parentId;
        private String showName;
        private String name;
        private String desc;
        private String title;
        private Integer status;
        private String url;
        private Integer type;
        private List<TreeNoteMO> childList;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getParentId() {
            return parentId;
        }

        public void setParentId(Long parentId) {
            this.parentId = parentId;
        }

        public String getShowName() {
            return showName;
        }

        public void setShowName(String showName) {
            this.showName = showName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public List<TreeNoteMO> getChildList() {
            return childList;
        }

        public void setChildList(List<TreeNoteMO> childList) {
            this.childList = childList;
        }
    }

    public class Contants {
        public static final String FIRST_MENU_PREFIX= "<li class=\"\">";
        public static final String FIRST_MENU_SUFFIX = "</li>";
        public static final String SUB_MENU_PREFIX= "<ul class=\"sub-menu\">";
        public static final String SUB_MENU_SUFFIX = "</ul>";
        public static final String LI_PREFIX= "<li>";
        public static final String LI_SUFFIX = "</li>";
        public static final String ICON_FORMAT = "<i class=\"icon-%1$s\"></i>";
        public static final String TITLE_FORMAT = "<span class=\"title\">%1$s</span>";
        public static final String ARROW_FORMAT = "<span class=\"arrow\"></span>";
        public static final String A_FORMAT = "<a href=\"%1$s\">%2$s</a>";
        public static final String JAVASCRIPT_FORMAT = "javascript:;";

    }

    public enum Type {
        CATEGORY(1, "目录节点"),
        FILE(2, "文件节点"),
        EX_FILE(3, "外部文件节点");

        private Integer code;
        private String name;

        Type(Integer code, String name) {
            this.code = code;
            this.name = name;
        }

        private static Map<Integer, Type> map = new HashMap<Integer, Type>();

        static {
            for (Type type : Type.values()) {
                map.put(type.getCode(), type);
            }
        }

        public Integer getCode() {
            return code;
        }

        public String getName() {
            return name;
        }

        public static Type getTypeByCode(Integer code) {
            return map.get(code);
        }
    }

    private List<TreeNoteMO> result;

    public List<TreeNoteMO> getResult() {
        return result;
    }

    public void setResult(List<TreeNoteMO> result) {
        this.result = result;
    }
}
