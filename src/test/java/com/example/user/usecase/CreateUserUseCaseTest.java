// src/test/java/com/example/user/usecase/CreateUserUseCaseTest.java
package com.example.user.usecase;

import com.example.user.entity.User;
import com.example.user.repository.InMemoryUserRepository;
import com.example.user.repository.UserRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CreateUserUseCaseTest {
    @Test
    void testCreateUser() {
        UserRepository userRepository = new InMemoryUserRepository();
        CreateUserUseCase createUserUseCase = new CreateUserUseCase(userRepository);

        User user = new User(null, "John Doe", "john@example.com");
        User createdUser = createUserUseCase.execute(user);

        assertNotNull(createdUser.getId());
        assertEquals("John Doe", createdUser.getName());
        assertEquals("john@example.com", createdUser.getEmail());
    }
}