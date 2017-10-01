package com.zhengpp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zpp360 on 2017/10/1.
 */
@RestController
public class HelleController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hi";
    }
}
