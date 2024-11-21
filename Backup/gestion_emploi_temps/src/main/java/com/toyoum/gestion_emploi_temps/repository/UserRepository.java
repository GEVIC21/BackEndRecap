package com.toyoum.gestion_emploi_temps.repository;

import com.toyoum.gestion_emploi_temps.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDetails,Integer> {
}
