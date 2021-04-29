package com.hmarianno.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hmarianno.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
