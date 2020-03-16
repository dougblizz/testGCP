package com.example.demo1.controller;

import com.example.demo1.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class holaMundoController {

    @GetMapping("/holamundo")
    public ModelAndView holaMundo(){
        ModelAndView m1 = new ModelAndView("holamundo");
        m1.addObject("person", new Person("Douglas", 31));
        return m1;
    }
}
