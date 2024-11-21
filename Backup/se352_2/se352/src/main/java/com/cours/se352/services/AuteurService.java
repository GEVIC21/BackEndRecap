package com.cours.se352.services;

import com.cours.se352.models.Auteur;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AuteurService {
    public List<Auteur> getAll();
    public Auteur add(Auteur auteur) ;

    public Auteur update(Auteur auteur);
    public void delete(Long id);

    public  Auteur getUser(Long id);
}
