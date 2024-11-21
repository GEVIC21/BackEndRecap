package com.cours.se352.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Auteur")
public class Auteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nom", length = 25)
    private String nom;
    @Column(name="prenom", length = 25)
    private String prenom ;
    @Column(name = "email", length = 100, unique = true)
    private String email;
    @Column(name = "password", length = 16)
    private String password;


}
