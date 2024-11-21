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
        this.auteurService.save(new Auteur("toto", "ama", 14,'M'));
        this.auteurService.save(new Auteur("toti", "amap", 15,'F'));
        this.auteurService.save(new Auteur("hu", "amad", 16,'M'));
        this.auteurService.save(new Auteur("koi", "amau", 17,'M'));
        this.auteurService.save(new Auteur("toty", "aman", 18,'F'));
        this.auteurService.save(new Auteur("ant", "amar", 25,'F'));

    }
}
