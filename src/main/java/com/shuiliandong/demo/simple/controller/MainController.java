package com.shuiliandong.demo.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
        ModelAndView modelAndView = new ModelAndView("main/index");
        return modelAndView;
    }

    @RequestMapping("/top")
    public ModelAndView toTop(){
        ModelAndView modelAndView = new ModelAndView("main/index");
        return modelAndView;
    }

    @RequestMapping("/foot")
    public ModelAndView toFoot(){
        ModelAndView modelAndView = new ModelAndView("main/index");
        return modelAndView;
    }
}
