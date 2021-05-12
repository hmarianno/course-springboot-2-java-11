package com.hmarianno.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hmarianno.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
