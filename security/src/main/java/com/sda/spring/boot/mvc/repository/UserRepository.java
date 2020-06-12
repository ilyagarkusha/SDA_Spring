package com.sda.spring.boot.mvc.repository;


import com.sda.spring.boot.mvc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
    List<User> findAll();


}
