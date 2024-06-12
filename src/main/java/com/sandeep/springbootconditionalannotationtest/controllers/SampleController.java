package com.sandeep.springbootconditionalannotationtest.controllers;

import com.sandeep.springbootconditionalannotationtest.models.SampleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired(required = false)
    SampleBean sampleBean;

    @GetMapping("/hello")
    public String hello()
    {
        return sampleBean.sayHello("Spring Boot");
    }
}
