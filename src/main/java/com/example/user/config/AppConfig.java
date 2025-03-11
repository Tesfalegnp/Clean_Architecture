// src/main/java/com/example/user/config/AppConfig.java
package com.example.user.config;

import com.example.user.repository.InMemoryUserRepository;
import com.example.user.repository.UserRepository;
import com.example.user.usecase.CreateUserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public UserRepository userRepository() {
        return new InMemoryUserRepository();
    }

    @Bean
    public CreateUserUseCase createUserUseCase(UserRepository userRepository) {
        return new CreateUserUseCase(userRepository);
    }
}