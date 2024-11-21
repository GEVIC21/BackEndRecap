package com.douvic.examen.iocspringboot.repository;

import com.douvic.examen.iocspringboot.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProduitRepository {
    Produit getProduitById(Long productId);

    List<Produit> getAllProduits();
}
