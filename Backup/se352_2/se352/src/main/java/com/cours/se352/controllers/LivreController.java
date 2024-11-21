package com.cours.se352.controllers;

import com.cours.se352.models.Auteur;
import com.cours.se352.models.Livre;
import com.cours.se352.services.AuteurService;
import com.cours.se352.services.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/livre")
public class LivreController {
    @Autowired
    private LivreService livreService ;

    @GetMapping("/get-all")
    public List<Livre> getAll(){
        return livreService.getAll();
    }

    @PostMapping("/add")
    public Livre add(@RequestBody Livre livre){
        return  livreService.add(livre);
    }


    @PutMapping("/update")
    public Livre update(@RequestBody Livre livre){
        return  livreService.update(livre);
    }

    @DeleteMapping("/delete/{id}")
    public  void delete(@PathVariable Long id){
        livreService.delete(id);
    }

    @GetMapping("/get/{id}")
    public  Livre getLivre(@PathVariable Long id){
        return  livreService.getLivre(id);
    }


}
