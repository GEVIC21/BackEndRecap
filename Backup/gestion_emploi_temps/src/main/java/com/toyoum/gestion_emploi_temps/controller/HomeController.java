package com.toyoum.gestion_emploi_temps.controller;

import com.toyoum.gestion_emploi_temps.model.UserDetails;
import com.toyoum.gestion_emploi_temps.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    private UserService userService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("login")
    public String login(){
        return "login";
    }

    @GetMapping("register")
    public String register(){
        return "register";
    }
    @PostMapping("/createUser")
    public String createUser(@ModelAttribute UserDetails user)
    {
//        System.out.println(user);
        UserDetails userDetails = userService.createUser(user);
        if(userDetails!=null)
        {
            System.out.println("Register Successfully");
        }
        else {
            System.out.println("The Server has encounter an error!!!");
        }
        return "register";
    }
}
