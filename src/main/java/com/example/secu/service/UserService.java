package com.example.secu.service;

import com.example.secu.entity.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
