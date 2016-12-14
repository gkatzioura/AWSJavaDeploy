package com.gkatzioura.deployment.beanstalk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gkatzioura on 11/23/16.
 */
@RestController
public class BeanstalkController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
