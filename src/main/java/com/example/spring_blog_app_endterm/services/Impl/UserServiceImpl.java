package com.example.spring_blog_app_endterm.services.Impl;

import com.example.spring_blog_app_endterm.entities.Roles;
import com.example.spring_blog_app_endterm.entities.Users;
import com.example.spring_blog_app_endterm.repositories.RolesRepository;
import com.example.spring_blog_app_endterm.repositories.UserRepository;
import com.example.spring_blog_app_endterm.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RolesRepository rolesRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, RolesRepository rolesRepository) {

    }



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users myUser = userRepository.findByEmail(username);

        if (myUser != null) {
            User secUser = new User(myUser.getEmail(), myUser.getPassword(), myUser.getRoles());
            return secUser;
        }

        throw new UsernameNotFoundException("User is not found");
    }

    @Override
    public Users getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public Users createUser(Users user) {
        Users checkUser = userRepository.findByEmail(user.getEmail());

        if(checkUser == null) {
            Roles role = rolesRepository.findByRole("ROLE_USER");

            if(role != null) {
                ArrayList<Roles> roles = new ArrayList<>();
                roles.add(role);
                user.setRoles(roles);
                user.setPassword(passwordEncoder.encode(user.getPassword()));
                return userRepository.save(user);
            }
        }

        return null;
    }
}
