package com.cours.se352.daos;

import com.cours.se352.models.Auteur;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuteurDao extends JpaRepository<Auteur,Long> {
    public List<Auteur> findByNom(String nom);

    @Override
    public Page<Auteur> findAll(Pageable pageable);

    //@Query("select a from Auteur a where age >:valAge")
    @Query(value = "SELECT * FROM Auteur WHERE age>:valAge",nativeQuery=true)
    public List<Auteur> getAuteurByAge(@Param("valAge") int valAge);


}
