// src/main/java/com/example/user/controller/UserController.java
package com.example.user.controller;

import com.example.user.entity.User;
import com.example.user.usecase.CreateUserUseCase;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final CreateUserUseCase createUserUseCase;

    // Constructor Dependency Injection
    public UserController(CreateUserUseCase createUserUseCase) {
        this.createUserUseCase = createUserUseCase;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return createUserUseCase.execute(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        // Implement this
        return null;
    }
}