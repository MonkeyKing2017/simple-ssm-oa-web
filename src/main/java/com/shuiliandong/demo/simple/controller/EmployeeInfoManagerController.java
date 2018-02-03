package com.shuiliandong.demo.simple.controller;


import com.alibaba.fastjson.JSONObject;
import com.shuiliandong.demo.simple.model.EmployeeMO;
import com.shuiliandong.demo.simple.model.PageResultMO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeInfoManagerController {

    @RequestMapping("/add")
    public ModelAndView toAdd(){
        ModelAndView modelAndView = new ModelAndView("employee/add");
        return modelAndView;
    }
    @RequestMapping("/update")
    public ModelAndView toUpdate(){
        ModelAndView modelAndView = new ModelAndView("employee/update");
        return modelAndView;
    }
    @RequestMapping("/list")
    public ModelAndView toList(){
        ModelAndView modelAndView = new ModelAndView("employee/list");
        return modelAndView;
    }

    @RequestMapping("/listData")
    @ResponseBody
    public PageResultMO<List<EmployeeMO>> list(){
        PageResultMO<List<EmployeeMO>> resultMO = new PageResultMO();

        List<EmployeeMO> list = new ArrayList<EmployeeMO>();
        resultMO.setRows(list);
        resultMO.setTotal(1);

        EmployeeMO employeeMO = new EmployeeMO();

        list.add(employeeMO);

        employeeMO.setAge(18);
        employeeMO.setEmployeeNo("hehe0001");
        employeeMO.setId(1L);
        employeeMO.setIdCard("282781718");
        employeeMO.setName("我就是这么帅");
        employeeMO.setStatus(3);
        return resultMO;
    }


}
