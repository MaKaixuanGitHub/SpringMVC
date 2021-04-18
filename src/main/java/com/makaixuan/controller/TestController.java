package com.makaixuan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * test Intercepter
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        System.out.println("TestController==>test()");
        return "OK";
    }
}
