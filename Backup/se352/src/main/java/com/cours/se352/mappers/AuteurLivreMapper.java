package com.cours.se352.mappers;

import com.cours.se352.dtos.AuteurLivreDTO;
import com.cours.se352.models.Auteur;
import org.springframework.stereotype.Service;

@Service
public class AuteurLivreMapper {

    public Auteur auteurLivreDTOToAuteur(AuteurLivreDTO auteurLivreDTO){
        Auteur auteur= new Auteur();
        auteur.setId(auteurLivreDTO.getIdAuteur());
        auteur.setNom(auteurLivreDTO.getNomAuteur());
        auteur.setPrenom(auteurLivreDTO.getPrenomAuteur());
        return auteur;
    }

}
