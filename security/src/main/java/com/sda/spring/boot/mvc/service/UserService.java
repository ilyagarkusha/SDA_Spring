package com.sda.spring.boot.mvc.service;

import com.sda.spring.boot.mvc.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
