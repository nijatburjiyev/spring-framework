package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/mentor/")
public class MentorController {

    @GetMapping("register")
    public String showForm(){
        return "mentor/mentor-register";
    }
}
