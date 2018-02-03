package com.shuiliandong.demo.simple;

import com.alibaba.fastjson.JSON;
import com.shuiliandong.demo.simple.dao.EmployeeInfoEntityMapper;
import com.shuiliandong.demo.simple.entity.EmployeeInfoEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class TestDao {

    @Autowired
    private EmployeeInfoEntityMapper employeeInfoEntityMapper;

    @Test
    public void test01(){
        EmployeeInfoEntity infoEntity = employeeInfoEntityMapper.selectByPrimaryKey(1L);
        System.out.println(JSON.toJSONString(infoEntity));
    }
}
