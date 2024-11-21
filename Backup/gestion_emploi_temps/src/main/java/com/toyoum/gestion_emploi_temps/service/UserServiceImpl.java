package com.toyoum.gestion_emploi_temps.service;

import com.toyoum.gestion_emploi_temps.model.UserDetails;
import com.toyoum.gestion_emploi_temps.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepo;

    @Override
    public UserDetails createUser(UserDetails user) {
        return userRepo.save(user);
    }
}
