package com.cours.se352.controllers;

import com.cours.se352.models.Auteur;
import com.cours.se352.services.AuteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/auteur")
public class AuteurController {
    @Autowired
    private AuteurService auteurService ;

    @GetMapping("/get-all")
    public List<Auteur> getAll(){
        return auteurService.getAll();
    }

    @PostMapping("/add")
    public Auteur add(@RequestBody Auteur user){
        return  auteurService.add(user);
    }


    @PutMapping("/update")
    public Auteur update(@RequestBody Auteur auteur){
        return  auteurService.update(auteur);
    }

    @DeleteMapping("/delete/{id}")
    public  void delete(@PathVariable Long id){
        auteurService.delete(id);
    }

    @GetMapping("/get/{id}")
    public  Auteur getAuteur(@PathVariable Long id){
        return  auteurService.getUser(id);
    }


}
