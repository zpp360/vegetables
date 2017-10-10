package com.zhengpp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zpp360 on 2017/10/1.
 */
@RestController
public class HelleController {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;
    @Value("${content}")
    private String content;

    @RequestMapping("hello")
    public String hello(){
        return content;
    }
}
