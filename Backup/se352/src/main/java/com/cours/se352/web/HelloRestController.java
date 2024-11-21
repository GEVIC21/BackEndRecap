package com.cours.se352.web;

import com.cours.se352.models.Auteur;
import com.cours.se352.services.AuteurService;
import com.cours.se352.services.MonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/auteur")
public class HelloRestController {

    //@Autowired
    private MonService monService;

    @Autowired
    private AuteurService auteurService;

    public HelloRestController(MonService monService) {
        this.monService = monService;
    }

    //@ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/bonjour",method = RequestMethod.GET, consumes = "application/json")
    //public String salutation(@PathVariable(required = false) String nomUtilisateur){
    public ResponseEntity<String> salutation(@RequestBody Auteur auteur){
            return  ResponseEntity.status(HttpStatus.OK).body(this.monService.salutationGenre(auteur));

    }

    //save auteur

    @RequestMapping(value = "/save",method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<Auteur> saveAuteur(@RequestBody Auteur auteur){
        return  ResponseEntity.status(HttpStatus.OK).body(this.auteurService.save(auteur));

    }

    //get all auteur

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public ResponseEntity<List<Auteur>> allAuteur(){
        return  ResponseEntity.status(HttpStatus.OK).body(this.auteurService.getAll());

    }

    @RequestMapping(value = "/find-name/{name}",method = RequestMethod.GET)
    public ResponseEntity<List<Auteur>> allAuteur(@PathVariable String name){
        return  ResponseEntity.status(HttpStatus.OK).body(this.auteurService.findByName(name));

    }

    @RequestMapping(value = "/find-age/{age}",method = RequestMethod.GET)
    public ResponseEntity<List<Auteur>> allByAgeAuteur(@PathVariable int age){
        return  ResponseEntity.status(HttpStatus.OK).body(this.auteurService.getAuteurByAge(age));

    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseEntity<Auteur> updateAuteur(@RequestBody Auteur auteur){
        return  ResponseEntity.status(HttpStatus.OK).body(this.auteurService.update(auteur));

    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public void deleteAuteur(@PathVariable Long id){
        this.auteurService.delete(id);

    }


    @RequestMapping(value = "/alls{page}",method = RequestMethod.GET)
    public ResponseEntity<Object> findAll(@RequestParam int page){
        return ResponseEntity.status(HttpStatus.OK).body(this.auteurService.findAll(page,5));
    }

}
