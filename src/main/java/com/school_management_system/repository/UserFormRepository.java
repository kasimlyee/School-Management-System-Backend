/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.school_management_system.repository;

/**
 *
 * @author Kasim Lyee
 */

import com.school_management_system.model.UserForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserFormRepository extends JpaRepository<UserForm, Long> {
}
