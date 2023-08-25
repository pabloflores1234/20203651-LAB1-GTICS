package com.example.lab1_gtics_20203651;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Lab1Controller {
    @RequestMapping(value = "/principal",method = RequestMethod.GET)
    public String paginaprincipal(){
        return "principal";
    }
}
