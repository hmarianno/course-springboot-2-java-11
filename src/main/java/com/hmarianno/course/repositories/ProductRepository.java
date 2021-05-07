package com.hmarianno.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hmarianno.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
