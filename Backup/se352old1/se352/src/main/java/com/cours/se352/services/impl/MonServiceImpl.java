package com.cours.se352.services.impl;

import com.cours.se352.models.Auteur;
import com.cours.se352.services.MonService;
import org.springframework.stereotype.Service;

@Service
public class MonServiceImpl implements MonService {
    @Override
    public String salutationGenre(Auteur auteur) {
        String result = "Bonjour ";
        if(Character.toString(auteur.getSexe()).equalsIgnoreCase("M"))
            result+="Monsieur";
        else if(Character.toString(auteur.getSexe()).equalsIgnoreCase("F"))
            result+="Madame";
        else
            result+="X";

        return result;
    }

    @Override
    public String genererMatricule(String nom, String prenom) {
        String matricule = nom.substring(0,1) + prenom.substring(0,1);
        return matricule;
    }
}
