package com.shuiliandong.demo.simple.controller;

import com.alibaba.fastjson.JSON;
import com.shuiliandong.demo.simple.model.LeftMenuMO;
import com.shuiliandong.demo.simple.util.GenerateTreeNoteUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping("/index")
    public ModelAndView toIndex(){
        ModelAndView modelAndView = new ModelAndView("main/index");
        return modelAndView;
    }

    @RequestMapping("/left")
    public ModelAndView toLeft(){
        ModelAndView modelAndView = new ModelAndView("main/left");
        LeftMenuMO leftMenuMO = new LeftMenuMO();
        GenerateTreeNoteUtil util = new GenerateTreeNoteUtil();
        List<LeftMenuMO.TreeNoteMO> list = util.getNoteAllForLevelAndNum(3,5, 20);
        leftMenuMO.setResult(list);
        modelAndView.addObject("result",leftMenuMO);
        System.out.println(JSON.toJSONString(list));
        return modelAndView;
    }

}
