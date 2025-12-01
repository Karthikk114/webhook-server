package com.example.webhook_runner.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SolutionRequest {
    private String finalQuery;
    
    // Additional constructor for convenience
    public SolutionRequest(String finalQuery) {
        this.finalQuery = finalQuery;
    }
}