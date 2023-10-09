package com.mariscandido.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariscandido.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
