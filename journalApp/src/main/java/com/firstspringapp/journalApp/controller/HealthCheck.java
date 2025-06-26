package com.firstspringapp.journalApp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HealthCheck {

    public String getMethodName(@RequestParam String param) {
        return new String();
    }

    @GetMapping("/health-check")
    public String healthCheck() {
        return "ok";

    }

}

// 1. We have maked this java file in controller package . To check that our
// application ic runnijg properly

// 2. We have used Getmapping gue map the fuction by endpoint called
// (/health-check)

// 3. Getmapping means ye ek get ki call ha
