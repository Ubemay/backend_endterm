package com.example.spring_blog_app_endterm.repositories;


import com.example.spring_blog_app_endterm.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface RolesRepository extends JpaRepository<Roles, Long> {

    Roles findByRole(String role);

}
