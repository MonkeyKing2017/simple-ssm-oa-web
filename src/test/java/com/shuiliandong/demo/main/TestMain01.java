package com.shuiliandong.demo.main;

import java.util.Properties;

public class TestMain01 {
    public static void main(String[] args){
        Properties properties = System.getProperties();
        String property = properties.getProperty("user.dir");
        System.out.println(property);
    }
}
