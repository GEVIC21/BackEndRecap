package com.cours.se352.services.impl;

import com.cours.se352.daos.AuteurDao;
import com.cours.se352.models.Auteur;
import com.cours.se352.services.AuteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuteurServiceImpl implements AuteurService {

    @Autowired
    private AuteurDao auteurDao;
    @Override
    public Auteur save(Auteur auteur) {
        return this.auteurDao.save(auteur);
    }

    @Override
    public List<Auteur> findByName(String name) {
        return this.auteurDao.findByNom(name);
    }


    //mise en place de la pagination
    @Override
    public List<Auteur> getAll() {
        return this.auteurDao.findAll();
    }
//    public List<Auteur> getAll() {
//        return this.auteurDao.findAll();
//    }

    @Override
    public Page<Auteur> findAll(int page, int size) {
        return this.auteurDao.findAll(PageRequest.of(page,size));
    }

    @Override
    public List<Auteur> getAuteurByAge(int age) {
        return this.auteurDao.getAuteurByAge(age);
    }

    @Override
    public Auteur update(Auteur auteur) {
        return  this.auteurDao.save(auteur);
    }

    @Override
    public void delete(Long id) {
        this.auteurDao.deleteById(id);
    }
}
