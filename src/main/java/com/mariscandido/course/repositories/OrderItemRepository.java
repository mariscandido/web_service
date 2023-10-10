package com.mariscandido.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariscandido.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
