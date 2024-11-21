package com.cours.se352.services;

import com.cours.se352.models.Livre;

import java.util.List;

public interface LivreService {

    public List<Livre> getAll();
    public Livre add(Livre livre) ;

    public Livre update(Livre livre);
    public void delete(Long id);

    public  Livre getLivre(Long id);
}
