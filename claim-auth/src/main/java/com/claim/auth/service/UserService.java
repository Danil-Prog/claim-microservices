package com.claim.auth.service;

import com.claim.auth.model.User;
import com.claim.auth.repository.UserRepository;
import jakarta.inject.Singleton;

@Singleton
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean saveUser(User user) {
        userRepository.save(user);
        return true;
    }
}
