package com.example.iocdemo.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@RestResource
public interface ProduitRepository extends JpaRepository<Produit, Long> {
    @Query("select p from Produit p order by p.libelle")

    List<Produit> list();
}
