package com.mariscandido.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariscandido.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
