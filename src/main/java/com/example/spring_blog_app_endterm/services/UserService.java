package com.example.spring_blog_app_endterm.services;

import com.example.spring_blog_app_endterm.entities.Users;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    Users getUserByEmail(String email);
    Users createUser(Users user);

}
