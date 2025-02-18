/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.school_management_system.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author Kasim Lyee
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(@NonNull CorsRegistry registry) {
        registry.addMapping("/api/schools")   // Allow CORS for this endpoint
                .allowedOrigins("https://localhost:5173")  // React frontend URL
                .allowedMethods("POST", "GET", "PUT", "DELETE")  // Allowed HTTP methods
                .allowCredentials(true)
                .allowedHeaders("*"); // Allow all headers
    }
}

