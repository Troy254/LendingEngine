package com.peerlender.lendingengine.controllers;
import com.peerlender.lendingengine.model.LoanApplication;
import com.peerlender.lendingengine.model.LoanRequest;
import com.peerlender.lendingengine.model.User;
import com.peerlender.lendingengine.repository.LoanRepository;
import com.peerlender.lendingengine.repository.UserRepository;
import com.peerlender.lendingengine.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController //a RESTful web service that handles HTTP requests and generates HTTP responses
@RequestMapping//is an annotation used in Spring Framework to map HTTP requests to handler methods in a controller

public class LoanController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    public LoanController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }


    @GetMapping("/users") public List<User> getUsers(){ return userRepository.findAll();}

    @GetMapping("/users/{id}")
    public User getUsers(@PathVariable Long id){
        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty()){
            throw new RuntimeException("We Could not find id " + id);
        }
        return user.get();
    }
    @PostMapping("/create")
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }
    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable Long id,@RequestBody User user){
        return userRepository.save(user);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id){
        userRepository.deleteById(id);
    }
}
