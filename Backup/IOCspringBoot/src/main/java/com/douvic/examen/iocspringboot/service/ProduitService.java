package com.douvic.examen.iocspringboot.service;

import com.douvic.examen.iocspringboot.model.Produit;
import com.douvic.examen.iocspringboot.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProduitService {
    private final ProduitRepository produitRepository;

    @Autowired
    public ProduitService(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    public Produit getProductById(Long productId) {
        return produitRepository.getProduitById(productId);
    }

    public List<Produit> getAllProducts() {
        return produitRepository.getAllProduits();
    }

    public Produit addProduit(Produit produit) {
        // Ajouter une logique de validation si nécessaire
        return produitRepository.save(produit);
    }
}
