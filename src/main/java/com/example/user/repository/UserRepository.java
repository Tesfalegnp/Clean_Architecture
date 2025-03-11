// src/main/java/com/example/user/repository/UserRepository.java
package com.example.user.repository;

import com.example.user.entity.User;

public interface UserRepository {
    User save(User user);
    User findById(Long id);
}
