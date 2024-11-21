package com.cours.se352.runner;

import com.cours.se352.models.Auteur;
import com.cours.se352.services.AuteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestService implements CommandLineRunner {
    @Autowired
    private AuteurService auteurService;

    @Override
    public void run(String... args) throws Exception {
        this.createAuteur();
    }

    public void createAuteur(){
        this.auteurService.save(new Auteur("toto","ama",14,'M'));
        this.auteurService.save(new Auteur("tqtq","els",6,'M'));
        this.auteurService.save(new Auteur("titi","afdzsma",54,'F'));
        this.auteurService.save(new Auteur("ririr","amxa",67,'M'));
        this.auteurService.save(new Auteur("dede","amxqa",49,'F'));
        this.auteurService.save(new Auteur("frfr","aqdma",14,'M'));
        this.auteurService.save(new Auteur("tgtg","amagd",27,'F'));
    }
}
