package com.test.jenkins.web.controller;

import com.test.jenkins.biz.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoService demoService;

    @RequestMapping("/1")
    public String demo1(){
        return demoService.demo();
    }
}
