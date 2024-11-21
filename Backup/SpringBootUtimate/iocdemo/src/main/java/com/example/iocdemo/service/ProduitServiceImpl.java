package com.example.iocdemo.service;

import com.example.iocdemo.entity.Produit;
import com.example.iocdemo.entity.ProduitRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional @RequiredArgsConstructor

public class ProduitServiceImpl implements ProduitService{

    private  final ProduitRepository produitService;
    @Override
    public Produit addProduit(Produit p) {
        return null;
    }

    @Override
    public Produit getProuduit(Long id) {
        return produitService.findAllById(id).get();
    }

    @Override
    public void deleteProduit(Long id) {

    }

    @Override
    public List<Produit> getAllProduit() {

        return null;
    }
}
