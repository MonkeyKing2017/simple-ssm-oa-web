package com.shuiliandong.demo.simple.util;

import com.alibaba.fastjson.JSON;
import com.shuiliandong.demo.simple.model.LeftMenuMO;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateTreeNoteUtil {

    private int clacNum(LeftMenuMO.TreeNoteMO noteMO) {
        int num = 0;
        List<LeftMenuMO.TreeNoteMO> childList = noteMO.getChildList();
        if (childList != null && childList.size() > 0) {
            num += childList.size();
            for (int i = 0; i < childList.size(); i++) {
                num += clacNum(childList.get(i));
            }
            return num;
        } else {
            return 0;
        }
    }

    private List<LeftMenuMO.TreeNoteMO> getList(int level, int allNoteNum) {
        List<LeftMenuMO.TreeNoteMO> result = new ArrayList<LeftMenuMO.TreeNoteMO>();
        LeftMenuMO.TreeNoteMO mo = getNoteOneForLevel(3, 0, null);
        System.out.println(JSON.toJSONString(mo));
        return result;
    }

    private final Random random = new Random();

    private boolean isHaveChild(int nextLevel) {
        return used < num && random.nextInt(2) == 1 && nextLevel != 0;
    }

    private LeftMenuMO.TreeNoteMO getNoteMo(int level) {
        if (used >= num) return null;
        LeftMenuMO.TreeNoteMO temp = new LeftMenuMO.TreeNoteMO();
        List<LeftMenuMO.TreeNoteMO> childList = null;
        used++;
        temp.setId((long) (used));
        temp.setShowName("菜单" + (used));
        temp.setUrl("http://www.baidu.com");
        int nextLevel = level - 1;
        if (isHaveChild(nextLevel)) {
            childList = new ArrayList<LeftMenuMO.TreeNoteMO>();
            int maxNum = num - used;
            maxNum = maxNum > factor ? factor : maxNum;
            maxNum = random.nextInt(maxNum) + 1;
            for (int j = 0; j < maxNum; j++) {
                LeftMenuMO.TreeNoteMO noteMo = getNoteMo(nextLevel);
                if (noteMo != null) {
                    childList.add(noteMo);
                }
            }
        }
        temp.setChildList(childList);
        temp.setType(CollectionUtils.isEmpty(temp.getChildList()) ? 3 : 1);
        return temp;
    }

    private int used = 0;
    private int num = 0;
    private int factor = 7;


    public List<LeftMenuMO.TreeNoteMO> getNoteAllForLevelAndNum(int level, int factorNum, int allNum) {
        List<LeftMenuMO.TreeNoteMO> result = new ArrayList<LeftMenuMO.TreeNoteMO>();
        used = 0;
        factor = factorNum;
        num = allNum;
        while (used < num) {
            LeftMenuMO.TreeNoteMO noteMo = getNoteMo(level);
            result.add(noteMo);
        }
        return result;
    }

    private LeftMenuMO.TreeNoteMO getNoteOneForLevel(int level, int index, LeftMenuMO.TreeNoteMO parentMo) {
        if (index == level) {
            return null;
        }
        LeftMenuMO.TreeNoteMO currentMo = new LeftMenuMO.TreeNoteMO();
        currentMo.setId((long) index);
        currentMo.setShowName("菜单" + index);
        currentMo.setParentId(parentMo != null ? parentMo.getId() : null);
        currentMo.setUrl("http://www.baidu.com");
        List<LeftMenuMO.TreeNoteMO> tempList = new ArrayList<LeftMenuMO.TreeNoteMO>();
        tempList.add(getNoteOneForLevel(level, index + 1, currentMo));
        currentMo.setChildList(tempList);
        currentMo.setType(CollectionUtils.isEmpty(tempList) ? 3 : 1);
        return currentMo;
    }
}
