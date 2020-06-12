package com.sda.spring.boot.mvc.service;

import com.sda.spring.boot.mvc.model.Role;
import com.sda.spring.boot.mvc.model.User;
import com.sda.spring.boot.mvc.repository.RoleRepository;
import com.sda.spring.boot.mvc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        if (user.isAdmin()) {
            user.setRoles(new HashSet<>(roleRepository.findAll()));
        }
        else {
            user.addRole(roleRepository.getOne(2L));
        }
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByName(username);
    }
}
