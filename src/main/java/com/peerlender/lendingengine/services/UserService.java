package com.peerlender.lendingengine.services;

import com.peerlender.lendingengine.model.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService {

    User createUser(User user);
}
