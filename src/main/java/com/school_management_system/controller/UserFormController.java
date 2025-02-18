/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.school_management_system.controller;

/**
 *
 * @author Kasim Lyee
 */
import com.school_management_system.model.UserForm;
import com.school_management_system.service.UserFormService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/schools")
public class UserFormController {

    @Autowired
    private UserFormService userFormService;

    @PostMapping()
    public ResponseEntity<?> submitForm(@Valid @RequestBody UserForm userForm) {
        UserForm savedForm = userFormService.saveUserForm(userForm);
        return ResponseEntity.ok(savedForm);
    }
}
