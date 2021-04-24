package com.hmarianno.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hmarianno.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
