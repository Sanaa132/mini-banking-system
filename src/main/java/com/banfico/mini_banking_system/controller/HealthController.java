package com.banfico.mini_banking_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/health")
    public Map<String, Object> health() {

        Map<String, Object> response = new LinkedHashMap<>();

        response.put("status", "UP");
        response.put("message", "Mini Banking System is running");
        response.put("timestamp", LocalDateTime.now());

        return response;
    }

    @GetMapping("/api/info")
    public Map<String, Object> applicationInfo() {

        Map<String, Object> response = new LinkedHashMap<>();

        response.put("application", "Mini Banking System");
        response.put("version", "1.0.0");
        response.put("environment", "Development");
        response.put("framework", "Spring Boot");
        response.put("javaVersion", System.getProperty("java.version"));

        return response;
    }
}