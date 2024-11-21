package com.cours.se352.services.impl;


import com.cours.se352.daos.LivreDao;
import com.cours.se352.models.Livre;
import com.cours.se352.services.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivreServiceImpl implements LivreService {

    @Autowired
    private LivreDao livreDao;
    @Override
    public Livre save(Livre livre) {
        return this.livreDao.save(livre);
    }

    //@Override
    //public List<Livre> findByName(String name) {
        //return this.auteurDao.findByNom(name);
    //}

    @Override
    public List<Livre> getAll() {
        return this.livreDao.findAll();
    }

    @Override
    public Livre update(Livre livre) {
        return  this.livreDao.save(livre);
    }

    @Override
    public void delete(Long id) {
        this.livreDao.deleteById(id);
    }
}
