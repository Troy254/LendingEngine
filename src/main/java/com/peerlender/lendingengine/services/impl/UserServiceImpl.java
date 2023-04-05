package com.peerlender.lendingengine.services.impl;

import com.peerlender.lendingengine.model.User;
import com.peerlender.lendingengine.repository.UserRepository;
import com.peerlender.lendingengine.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        user.setFirstName(user.getFirstName());
        user.setLastName(user.getLastName());
        user.setAge(user.getAge());
        user.setOccupation(user.getOccupation());
        User newUser = userRepository.save(user);
        return newUser;
    }
}
