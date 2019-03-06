package com.test.jenkins.biz;

import com.test.jenkins.dao.DemoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class DemoService {

    @Resource
    private DemoMapper demoMapper;

    public String demo(){
        log.info("获取的数量,{}",demoMapper.count());
        return "hello world";
    }
}
