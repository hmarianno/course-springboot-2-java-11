package com.hmarianno.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hmarianno.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
