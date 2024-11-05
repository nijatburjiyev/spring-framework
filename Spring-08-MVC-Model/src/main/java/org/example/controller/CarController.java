package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class CarController {

    @RequestMapping("/info")  //localhost:8080/car/info?make=Honda
    public String carInfo(@RequestParam String make, Model model){
        model.addAttribute("make",make);
        System.out.println(make);
        return "car/car-info";
    }

    @RequestMapping("/colorInfo/{color}")  //localhost:8080/car/info?make=Honda
    public String colorInfo(@PathVariable String color, Model model){
        model.addAttribute("color",color);
        System.out.println(color);
        return "car/car-info";
    }

}
