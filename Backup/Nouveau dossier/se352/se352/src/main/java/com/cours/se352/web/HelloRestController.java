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

//    @GetMapping("/bonjour1")
    //Question #3
    @RequestMapping("/bonjour1")
    @ResponseBody
    public String bonjour1(@RequestParam String nom, @RequestParam String prenom){
        return "Bonjour "+nom+ " " + prenom;
    }
    //Question #4
//    L'annotation @RequestBody est utilisée pour
//    désérialiser le corps d'une requête HTTP en un objet Java.
//    Elle est généralement utilisée pour traiter des requêtes POST, PUT ou PATCH
//    qui contiennent des données JSON ou XML dans leur corps.
//
//    Dans le cas de la méthode "bonjour1", nous passons un objet "Auteur"
//    en tant que paramètre de la requête GET, donc le corps de la requête est vide.
//    Nous n'avons donc pas besoin d'utiliser l'annotation @RequestBody pour désérialiser
//    le corps de la requête.


    //Question #5
    @PostMapping(value = "/bonjour2", consumes = "application/json")
    @ResponseBody
    public String bonjour2(@RequestBody String  auteur){
        return "Bonjour " +auteur;
    }

    //Question #6

    @PostMapping(value = "/bonjour3", produces = "application/json")
    @ResponseBody
    public Auteur bonjour3(){
        Auteur auteur = new Auteur("Ndilbe", "Douvic",  "matricule");
//        auteur.setNom("Jean");
//        auteur.setPrenom("Michel");
//        auteur.setSexe('M');
        return auteur;

    }
//Question #7


    @GetMapping("/bonjour4")
    @ResponseBody
    public ResponseEntity<String> bonjour4(){
        String message = "Bonjour tout le monde";
        return new ResponseEntity<>( HttpStatus.CREATED);
    }

//Question #8

//    @ResponseBody est utilisé pour renvoyer des données
//    simples directement dans le corps de la réponse HTTP,
//    tandis que ResponseEntity est utilisé pour contrôler plus finement l'ensemble de la réponse HTTP,
//    y compris le code d'état, les en-têtes et le corps de la réponse.



    //Question #9 et #10
    @GetMapping("/bonjour5")
    @ResponseBody
    public ResponseEntity<String> bonjour5(){
        String message = "Bonjour tout le monde";
        return new ResponseEntity<>( message,HttpStatus.INSUFFICIENT_STORAGE);
    }

    @PostMapping( "/auteurs")
    @ResponseBody
    public ResponseEntity<Auteur> creerAuteur(@RequestBody Auteur auteur)
    {
        String matricule = monService.genererMatricule(auteur.getNom(), auteur.getPrenom());
        auteur.setMatricule(matricule);
        return new ResponseEntity<>(auteur, HttpStatus.CREATED);
    }




}