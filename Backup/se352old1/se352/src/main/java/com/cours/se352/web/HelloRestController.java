package com.cours.se352.web;

import com.cours.se352.models.Auteur;
import com.cours.se352.services.MonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
//@Controller
@RequestMapping(value = "/hello")
public class HelloRestController {

    @Autowired
    private MonService monService;

    public HelloRestController(MonService monService) {
        this.monService = monService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/bonjour", method = RequestMethod.GET, consumes ="application/json")
    public String salutation(@
    PathVariable(required = false) String nomUtilisateur){
        return "Hello "+nomUtilisateur;
    }

    public ResponseEntity<String> salutation(@RequestBody Auteur auteur){
        return  ResponseEntity.status(HttpStatus.OK).body("Bonjour "+auteur.getNom());
    }

//    public ResponseEntity<String> salutation(@RequestBody Auteur auteur){
//        return  ResponseEntity.status(HttpStatus.OK).body(this.monService.salutationGenre(auteur));
//    }

}