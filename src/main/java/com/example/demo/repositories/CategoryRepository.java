package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entitites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
