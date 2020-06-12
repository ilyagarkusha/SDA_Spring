package com.sda.spring.boot.mvc.controller;


import com.sda.spring.boot.mvc.model.User;
import com.sda.spring.boot.mvc.repository.UserRepository;
import com.sda.spring.boot.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class UserController {

    private UserRepository repository;

    @Autowired
    private UserService userService;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.repository = userRepository;
    }

    @GetMapping("/")
    public String indexPage() {
        return "redirect:/users";
    }

    @GetMapping("/registration")
    public String registerUser(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "sign-up";

    }

    @GetMapping("/users")
    public String showAllUsers(Model model) {
        List<User> users = repository.findAll();
        model.addAttribute("users", users);
        return "user-list";
    }


    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.save(user);

        return "redirect:/users";

    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("userId") long theId, Model model) {

        User user = repository.getOne(theId);
        // delete customer
        repository.delete(user);


        return "redirect:/users";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("userId") long theId, Model model) {

        // get the customer from the database
        User user = repository.getOne(theId);

        // set customer as a model attribute to pe-populate the form
        model.addAttribute("user", user);

        // send over to our form
        return "user-update";
    }


}
