package com.cours.se352.web;

import com.cours.se352.models.Auteur;
import com.cours.se352.models.Livre;
import com.cours.se352.services.AuteurService;
import com.cours.se352.services.MonService;
import com.cours.se352.services.impl.LivreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/livre")
public class LivreController {


    @Autowired
    private LivreServiceImpl livreService;



    //save livre

    @RequestMapping(value = "/save",method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<Livre> saveAuteur(@RequestBody Livre livre){
        return  ResponseEntity.status(HttpStatus.OK).body(this.livreService.save(livre));

    }

    //get all auteur

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public ResponseEntity<List<Livre>> allAuteur(){
        return  ResponseEntity.status(HttpStatus.OK).body(this.livreService.getAll());

    }

    //@RequestMapping(value = "/find-name/{name}",method = RequestMethod.GET)
    //public ResponseEntity<List<Auteur>> allAuteur(@PathVariable String name){
    //    return  ResponseEntity.status(HttpStatus.OK).body(this.livreService.findByName(name));
    //}


    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseEntity<Livre> updateAuteur(@RequestBody Livre livre){
        return  ResponseEntity.status(HttpStatus.OK).body(this.livreService.update(livre));

    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public void deleteAuteur(@PathVariable Long id){
        this.livreService.delete(id);

    }
}
