package com.cours.se352.repo;

import com.cours.se352.models.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuteurRepo extends JpaRepository<Auteur, Long> {
}
