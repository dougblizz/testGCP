package com.example.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.websocket.server.PathParam;

@Controller
@RequestMapping("/")
public class EjemploGet {

    @GetMapping("/ejemplo_get")
    public ModelAndView ejemploGet(@RequestParam(name = "nm", required = false, defaultValue = "NULL") String name){
        ModelAndView modelGet = new ModelAndView("ejemplo_get");
        modelGet.addObject("name_in_model", name);
        return modelGet;
    }

    @GetMapping("/ejemplo_get2/{nm}")
    public ModelAndView ejemploGet2(@PathVariable(value = "nm") String name){
        ModelAndView modelGet = new ModelAndView("ejemplo_get");
        modelGet.addObject("name_in_model", name);
        return modelGet;
    }
}
