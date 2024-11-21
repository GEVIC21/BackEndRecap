package com.douvic.examen.iocspringboot.repository;

import com.douvic.examen.iocspringboot.model.Produit;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaProduitRepository implements ProduitRepository{

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public Produit getProduitById(Long productId) {
        return entityManager.find(Produit.class, productId);
    }

    @Override
    public List<Produit> getAllProduits() {
        return entityManager.createQuery("SELECT p FROM Produit p", Produit.class).getResultList();
    }
}
