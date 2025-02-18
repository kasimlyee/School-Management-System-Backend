/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.school_management_system.controller;

/**
 *
 * @author Kasim Lyee
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {
    
    @PostMapping("/error")
    public String handleError(){
        return "Error";
    }
    
}
