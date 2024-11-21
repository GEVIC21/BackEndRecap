package com.cours.se352.repo;

import com.cours.se352.models.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreRepo extends JpaRepository<Livre, Long> {
}
