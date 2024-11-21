package com.cours.se352.services;

import com.cours.se352.models.Auteur;
import org.springframework.data.domain.Page;

import java.util.List;

public interface AuteurService {
    public Auteur save(Auteur auteur);
    public List<Auteur> findByName(String name);
    //public Auteur findById(String name);
    public List<Auteur> getAll();
    public Page<Auteur> findAll(int page, int size);
    public List<Auteur> getAuteurByAge(int age);
    public Auteur update(Auteur auteur);
    public void delete(Long id);
}
