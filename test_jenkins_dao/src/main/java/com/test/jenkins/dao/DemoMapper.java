package com.test.jenkins.dao;

import com.test.jenkins.entity.Demo;

public interface DemoMapper {

    Demo getById(Long id);

    int count();
}
