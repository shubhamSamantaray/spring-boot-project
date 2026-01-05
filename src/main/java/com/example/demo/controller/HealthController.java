package com.example.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.helper.HealthResponse;


@RestController
@RequestMapping("/api")
public class HealthController {

    // @GetMapping("/health")
    // public Map<String, String> health() {
    //     return Map.of("status", "UP");
    // }

    @GetMapping("/health")
    public HealthResponse health() {
        return new HealthResponse("UP", System.currentTimeMillis());
    }
}
