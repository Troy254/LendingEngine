package com.peerlender.lendingengine.controllers;

import com.peerlender.lendingengine.model.LoanRequest;
import com.peerlender.lendingengine.model.User;
import com.peerlender.lendingengine.repository.LoanRepository;
import com.peerlender.lendingengine.repository.UserRepository;
import com.peerlender.lendingengine.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class LoanController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    public LoanController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }
}
