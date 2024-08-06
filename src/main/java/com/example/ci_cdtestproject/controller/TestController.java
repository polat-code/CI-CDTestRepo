package com.example.ci_cdtestproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {

    @GetMapping("/test01")
    public String getTest01() {
        return "Test 01 is returned by server";
    }


    @GetMapping("/test02")
    public String getTest02() {
        return "Test 02 is returned by server";
    }



}
