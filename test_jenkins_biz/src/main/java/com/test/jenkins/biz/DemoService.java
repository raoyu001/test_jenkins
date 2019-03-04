package com.test.jenkins.biz;

import com.test.jenkins.dao.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DemoService {

    @Resource
    private DemoMapper demoMapper;

    public String demo(){
        return "hello world";
    }
}
