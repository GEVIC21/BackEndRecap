package com.mycompany.hellorestapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ApiController {

@GetMapping("/api/hello")
    public Response hello(){
        return  new Response("Hello World Rest API");
    }
}
