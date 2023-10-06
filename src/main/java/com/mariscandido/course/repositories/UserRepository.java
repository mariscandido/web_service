package com.mariscandido.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariscandido.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
