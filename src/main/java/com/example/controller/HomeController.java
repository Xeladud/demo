package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping
    public @ResponseBody String test() {
        return "ok";
    }

    @GetMapping
    public @ResponseBody String test2() {
        return "ok2";
    }
}
