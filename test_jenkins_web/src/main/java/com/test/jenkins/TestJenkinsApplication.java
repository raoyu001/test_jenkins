package com.test.jenkins;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.test.jenkins.dao")
@SpringBootApplication(scanBasePackages = "com.test.jenkins")
public class TestJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestJenkinsApplication.class,args);
    }
}
