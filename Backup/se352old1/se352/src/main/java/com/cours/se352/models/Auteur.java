package com.cours.se352.models;

import jakarta.persistence.*;

@Entity
@Table(name = "auteurs")
public class Auteur {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private  String nom;
    private  String prenom;
    private char sexe;
    private String matricule;

//    public Auteur(String nom, String prenom, char sexe, String matricule) {
//        this.nom = nom;
//        this.prenom = prenom;
//        this.sexe = sexe;
//        this.matricule = matricule;
//    }
//    public Auteur(String nom, String prenom,String matricule) {
//        this.nom = nom;
//        this.prenom = prenom;
//        this.matricule = matricule;
//    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
}
