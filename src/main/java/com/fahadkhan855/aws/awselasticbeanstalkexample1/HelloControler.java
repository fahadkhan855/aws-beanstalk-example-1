package com.fahadkhan855.aws.awselasticbeanstalkexample1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloControler {
    public String hello(){
        return"Hello Youtube";
    }
}
