package com.cours.se352.services;

import com.cours.se352.models.Auteur;

import java.util.List;

public interface AuteurService {
    public Auteur save(Auteur auteur);
    public List<Auteur> findByName(String name);
    public List<Auteur> getAll();
    public List<Auteur> getAuteurByAge(int age);
    public Auteur update(Auteur auteur);
    public void delete(Long id);

    public Page<Auteur> findAll(int page, int size);
}
