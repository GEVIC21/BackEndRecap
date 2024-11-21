package com.daillycodebuffer.springbootdemo.controller;

import com.daillycodebuffer.springbootdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
//@ResponseBody
@RestController
public class HomeController {

    @RequestMapping("/")
    public String Home(){
        return "Hello World";
    }

   // @RequestMapping(value = "/user", method = RequestMethod.GET)
    @GetMapping("/user")
    public User user(){
        User user = new User();
        user.setId("1");
        user.setName("Shabbir");
        user.setEmailId("shabbir@gmail.com");

        return user;
    }

    @GetMapping("/requestParam")
    public String requestParams(@RequestParam String name,
                                @RequestParam(name="email", required = false, defaultValue = "") String emailId){
        return "your name is "+name+ " and email is "+emailId;
    }
}
