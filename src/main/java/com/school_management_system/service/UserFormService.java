/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.school_management_system.service;

/**
 *
 * @author Kasim Lyee
 */

import com.school_management_system.model.UserForm;
import com.school_management_system.repository.UserFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserFormService {

    @Autowired
    private UserFormRepository userFormRepository;

    public UserForm saveUserForm(UserForm userForm) {
        return userFormRepository.save(userForm);
    }
}
