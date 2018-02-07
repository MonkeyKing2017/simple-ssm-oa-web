package com.shuiliandong.demo.simple.service;

import com.shuiliandong.demo.simple.model.EmployeeMO;

public interface IEmployeeInfoService {
	/**
	 * insert
	 * @param employeeMO
	 * @return
	 */
	int insert(EmployeeMO employeeMO);
	
	/**
	 * 全能insert
	 * @param employeeMO
	 * @return
	 */
	int insertSelective(EmployeeMO employeeMO);
	
	/**
	 * delete
	 * @param id
	 * @return
	 */
	int deleteByPrimaryKey(Long id);
	
	/**
	 * 万能update
	 * @param employeeMO
	 * @return
	 */
	int updateByPrimaryKeySelective(EmployeeMO employeeMO);
	
	/**
	 * update
	 * @param employeeMO
	 * @return
	 */
	int updateByPrimaryKey(EmployeeMO employeeMO);
	
	/**
	 * 全表select
	 * @param id
	 * @return
	 */
	EmployeeMO selectByPrimaryKey(Long id);
	
}
