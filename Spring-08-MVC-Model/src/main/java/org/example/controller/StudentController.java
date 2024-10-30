package org.example.controller;

import org.example.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class StudentController {
    @RequestMapping("/welcome")
    public String homePage(Model model) {
        List<Student> students = Arrays.asList(  // Create a sample student list
                new Student("Nijat", 32, "A"),
                new Student("Alice", 25, "A")  // Add more students as needed
        );
        model.addAttribute("students", students);  // Add the student list to model

        return "/student/welcome";
    }
}
