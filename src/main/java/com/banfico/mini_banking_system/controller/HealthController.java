package com.banfico.mini_banking_system.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootVersion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class HealthController {

    @Value("${java.version}")
    private String javaVersion;

    @Value("${app.version}")
    private String appVersion;

    @Value("${git.commit.id.abbrev:Unknown}")
    private String commitId;

    @Value("${git.branch:Unknown}")
    private String branch;

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
        response.put("version", appVersion);
        response.put("framework", "Spring Boot");
        response.put("springBootVersion", SpringBootVersion.getVersion());
        response.put("javaVersion", javaVersion);
        response.put("environment", "Development");
        response.put("gitBranch", branch);
        response.put("commitId", commitId);

        return response;
    }
}