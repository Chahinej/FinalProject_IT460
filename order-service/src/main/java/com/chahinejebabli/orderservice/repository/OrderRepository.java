package com.chahinejebabli.orderservice.repository;

import com.chahinejebabli.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
