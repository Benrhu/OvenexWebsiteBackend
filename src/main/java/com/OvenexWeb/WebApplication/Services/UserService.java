package com.OvenexWeb.WebApplication.Services;

import com.OvenexWeb.WebApplication.Repositories.UserRepository;
import com.OvenexWeb.WebApplication.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User findAll() {
        return (User) userRepository.findAll();
    }

    public Optional findByUserId(Integer userId) {
        return userRepository.findById(userId);
    }
}
