package com.cours.se352.controllers;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    public String salutation(){
        return "Bonjour";
    }
}
