package com.cours.se352.services;

import com.cours.se352.models.Auteur;
import org.springframework.stereotype.Service;

public interface MonService {

    public String salutationGenre(Auteur auteur);

    public String genererMatricule(String nom , String prenom);
}
