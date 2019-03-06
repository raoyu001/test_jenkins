package com.test.jenkins;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

@MapperScan("com.test.jenkins.dao")
@SpringBootApplication(scanBasePackages = "com.test.jenkins")
public class TestJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(TestJenkinsApplication.class);
        //setApp(app);
        app.run(args);
    }

    private static void setApp(SpringApplication app) {
        String activeProfile = System.getProperty("spring.profiles.active");
        if (StringUtils.isEmpty(activeProfile)) {
            app.setAdditionalProfiles("qa");
        }
    }
}
