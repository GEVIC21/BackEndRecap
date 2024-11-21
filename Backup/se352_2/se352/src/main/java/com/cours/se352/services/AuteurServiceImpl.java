package com.cours.se352.services;

import com.cours.se352.models.Auteur;
import com.cours.se352.repo.AuteurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class AuteurServiceImpl implements AuteurService{
    @Autowired
    private AuteurRepo auteurRepo ;
    @Override
    public List<Auteur> getAll() {
        return auteurRepo.findAll();
    }

    @Override
    public Auteur add(Auteur auteur) {
        return auteurRepo.save(auteur);
    }

    @Override
    public Auteur update(Auteur auteur) {
        return auteurRepo.save(auteur);
    }

    @Override
    public void delete(Long id) {
        auteurRepo.deleteById(id);
    }

    @Override
    public Auteur getUser(Long id) {
        Auteur auteur =auteurRepo.findById(id).orElse(null);
        return auteur;
    }
}
