package com.shuiliandong.demo.simple.controller;


import com.alibaba.fastjson.JSONObject;
import com.shuiliandong.demo.simple.model.EmployeeMO;
import com.shuiliandong.demo.simple.model.PageResultMO;
import com.shuiliandong.demo.simple.service.IEmployeeInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/employee")
public class EmployeeInfoManagerController {

	@Autowired
	IEmployeeInfoService employeeInfoService;
	
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

//        list.add(employeeMO);

        employeeMO.setAge(18);
        employeeMO.setEmployeeNo("hehe0001");
        employeeMO.setId(1L);
        employeeMO.setIdCard("282781718");
        employeeMO.setName("我就是这么帅");
        employeeMO.setStatus(3);
        list.add(employeeMO);
        employeeMO = new EmployeeMO();
        employeeMO.setAge(18);
        employeeMO.setEmployeeNo("hehe0001");
        employeeMO.setId(1L);
        employeeMO.setIdCard("282781718");
        employeeMO.setName("我就是这么帅");
        employeeMO.setStatus(3);
        list.add(employeeMO);
        return resultMO;
    }
    
    @RequestMapping("/updateData")
    @ResponseBody
    public String Update(HttpServletRequest request,HttpServletResponse response) throws ParseException{
    	String name = request.getParameter("name");
    	String age = request.getParameter("age");
    	String idCard = request.getParameter("idCard");
    	String status = request.getParameter("status");
    	Date joinDate = new Date(request.getParameter("joinDate"));
    	Date leaveDate = new Date(request.getParameter("leaveDate"));
    	// TODO判断当前用户权限
    	EmployeeMO employeeMO = new EmployeeMO();
    	employeeMO.setName(name);
    	employeeMO.setAge(Integer.valueOf(age));
    	employeeMO.setStatus(Integer.valueOf(status));
    	employeeMO.setIdCard(idCard);
    	employeeMO.setJoinDate(joinDate);
    	employeeMO.setLeaveDate(leaveDate);
    	//TODO
//    	int i = employeeInfoService.updateByPrimaryKeySelective(employeeMO);
//    	if (i <1) {
//			return "error";
//		}
        return "success";
    }


}
