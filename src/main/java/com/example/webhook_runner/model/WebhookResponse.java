package com.example.webhook_runner.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebhookResponse {
    
    @JsonProperty("webhook")
    private String webhookUrl;
    
    @JsonProperty("accessToken")
    private String accessToken;
    
    // No-argument constructor
    public WebhookResponse() {
    }
    
    // Constructor with parameters
    public WebhookResponse(String webhookUrl, String accessToken) {
        this.webhookUrl = webhookUrl;
        this.accessToken = accessToken;
    }
    
    // GETTER for webhookUrl - THIS IS WHAT'S MISSING
    public String getWebhookUrl() {
        return webhookUrl;
    }
    
    // GETTER for accessToken
    public String getAccessToken() {
        return accessToken;
    }
    
    // SETTERS (required for JSON deserialization)
    public void setWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
    }
    
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
    
    // toString() method for debugging
    @Override
    public String toString() {
        return "WebhookResponse{" +
               "webhookUrl='" + webhookUrl + '\'' +
               ", accessToken='" + (accessToken != null ? "[HIDDEN]" : "null") + '\'' +
               '}';
    }
}