package com.jenkins.practice.jenkins.Controller;

import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsTestController {
    @GetMapping("/")
    public String helloWorld(){
        return JSONObject.quote("Hello World corss app");
    }
}
