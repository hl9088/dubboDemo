package com.lhl.consumer.controller;

import com.lhl.provider.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private ITestService testService;

    @RequestMapping("/test2")
    public String testDubbo(HttpServletRequest request){
        return testService.sayHello("this is a dubbo test");
    }
}
