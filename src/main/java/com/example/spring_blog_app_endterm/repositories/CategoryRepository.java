package com.example.spring_blog_app_endterm.repositories;

import com.example.spring_blog_app_endterm.entities.Catigories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Catigories, Long> {
}
