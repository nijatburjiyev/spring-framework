package org.example.controller;

import org.example.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/register")
    public String register(Model model) {

        model.addAttribute("students", DataGenerator.createStudents(5));
        return  "student/register";
    }
}
