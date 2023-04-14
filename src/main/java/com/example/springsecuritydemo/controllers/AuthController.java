package com.example.springsecuritydemo.controllers;

import com.example.springsecuritydemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    private PersonService personService;

    @Autowired
    public HelloController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/index")
    public String sayHello() {
        return "index";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

}
