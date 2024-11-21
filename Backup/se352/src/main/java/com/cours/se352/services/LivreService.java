package com.cours.se352.services;


import com.cours.se352.models.Livre;

import java.util.List;

public interface LivreService {
    public Livre save(Livre livre);
    //public List<Livre> findByName(String name);
    public List<Livre> getAll();
    public Livre update(Livre livre);
    public void delete(Long id);
}
