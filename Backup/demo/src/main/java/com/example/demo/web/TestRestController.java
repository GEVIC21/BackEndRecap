package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@RestController
public class TestRestController {

//    @RequestMapping(value = "/bonjour", method = RequestMethod.GET)
    @GetMapping()
//    public String bonjour(@RequestParam String auteur){
//        return "Bonjour "+auteur;
//    }
//    public String bonjour(@RequestBody String nom){
//        return "Bonjour ";
//    }
}
