package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/hi")
public class HomeController {

    @RequestMapping("/main-menu")
    public String showPage(){
        System.out.println("In ");
        return "main-menu";
    }
}
