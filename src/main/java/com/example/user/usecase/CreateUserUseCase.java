// src/main/java/com/example/user/usecase/CreateUserUseCase.java
package com.example.user.usecase;

import com.example.user.entity.User;
import com.example.user.repository.UserRepository;

public class CreateUserUseCase {
    private final UserRepository userRepository;

    // Constructor Dependency Injection
    public CreateUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(User user) {
        // Business logic (e.g., validate email)
        if (user.getEmail() == null || !user.getEmail().contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }

        // Save user
        return userRepository.save(user);
    }
}