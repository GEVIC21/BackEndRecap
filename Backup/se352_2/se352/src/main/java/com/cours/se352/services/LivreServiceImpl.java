package com.cours.se352.services;

import com.cours.se352.models.Livre;
import com.cours.se352.repo.LivreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LivreServiceImpl implements LivreService{
    @Autowired
    private LivreRepo livreRepo ;
    @Override
    public List<Livre> getAll() {
        return livreRepo.findAll();
    }

    @Override
    public Livre add(Livre livre) {
        return livreRepo.save(livre);
    }

    @Override
    public Livre update(Livre livre) {
        return livreRepo.save(livre);
    }

    @Override
    public void delete(Long id) {
        livreRepo.deleteById(id);
    }

    @Override
    public Livre getLivre(Long id) {
        Livre livre = livreRepo.findById(id).orElse(null);
        return livre;
    }
}
