package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> credentials) {
        String username = credentials.get("username");
        String password = credentials.get("password");
        
        if ("jiajia".equals(password)) {
            Map<String, Object> response = new HashMap<>();
            response.put("status", "success");
            response.put("username", username);
            return ResponseEntity.ok(response);
        }
        
        return ResponseEntity.badRequest().body("Invalid credentials");
    }
}