package com.rupali.kanchanflow.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@CrossOrigin(origins = {
        "http://localhost:3000",
        "http://127.0.0.1:3000",
        "https://kanchanflow-lovat.vercel.app"
})
@RestController
@RequestMapping("/api/v1")
public class HealthController {

    @GetMapping("/health")
    public ResponseEntity<Map<String, String>> healthCheck() {
        Map<String, String> response = new LinkedHashMap<>();
        response.put("status", "UP");
        response.put("message", "KanchanFlow backend is running");
        return ResponseEntity.ok(response);
    }
}
