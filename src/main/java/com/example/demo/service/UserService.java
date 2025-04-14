package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User login(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null && "jiajia".equals(password)) {
            user.setLastLoginTime(LocalDateTime.now().toString());
            return userRepository.save(user);
        }
        return null;
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}