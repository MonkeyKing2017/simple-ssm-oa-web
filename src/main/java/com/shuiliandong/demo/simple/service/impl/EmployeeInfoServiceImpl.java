package com.shuiliandong.demo.simple.service.impl;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.shuiliandong.demo.simple.dao.EmployeeInfoEntityMapper;
import com.shuiliandong.demo.simple.entity.EmployeeInfoEntity;
import com.shuiliandong.demo.simple.model.EmployeeMO;
import com.shuiliandong.demo.simple.service.IEmployeeInfoService;

public class EmployeeInfoServiceImpl implements IEmployeeInfoService {

	@Autowired
	EmployeeInfoEntityMapper employeeInfoService;
	
	@Autowired
	DozerBeanMapper beanMapper;
	
	@Override
	public int insert(EmployeeMO employeeMO) {
		return employeeInfoService.insert(beanMapper.map(employeeMO, EmployeeInfoEntity.class));
	}

	@Override
	public int insertSelective(EmployeeMO employeeMO) {
		return employeeInfoService.insertSelective(beanMapper.map(employeeMO, EmployeeInfoEntity.class));
	}

	@Override
	public int deleteByPrimaryKey(Long id) {
		return employeeInfoService.deleteByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(EmployeeMO employeeMO) {
		return employeeInfoService.updateByPrimaryKeySelective(beanMapper.map(employeeMO, EmployeeInfoEntity.class));
	}

	@Override
	public int updateByPrimaryKey(EmployeeMO employeeMO) {
		return employeeInfoService.updateByPrimaryKey(beanMapper.map(employeeMO, EmployeeInfoEntity.class));
	}

	@Override
	public EmployeeMO selectByPrimaryKey(Long id) {
		return beanMapper.map(employeeInfoService.selectByPrimaryKey(id), EmployeeMO.class);
	}

}
