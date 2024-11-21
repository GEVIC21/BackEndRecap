package com.cours.se352.services.impl;

import com.cours.se352.models.Auteur;
import com.cours.se352.services.MonService;
import org.springframework.stereotype.Service;

@Service
public class MonServiceImpl implements MonService {


    @Override
    public String genererMatricule(String nom, String prenom) {
        String matricule = nom.substring(0,2) + prenom.substring(0,2);
        return matricule;
    }
}
