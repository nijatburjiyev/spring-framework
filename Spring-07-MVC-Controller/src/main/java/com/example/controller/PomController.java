package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PomController {

    @RequestMapping("/home")
    public String home() {
        return "home.html";
    }

}
