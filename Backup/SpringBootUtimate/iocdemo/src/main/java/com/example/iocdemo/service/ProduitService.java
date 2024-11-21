package com.example.iocdemo.service;

import com.example.iocdemo.entity.Produit;

import java.util.List;

public interface ProduitService {

    Produit addProduit(Produit p);
    Produit getProuduit(Long id);

    void deleteProduit(Long id);
    List<Produit> getAllProduit();

