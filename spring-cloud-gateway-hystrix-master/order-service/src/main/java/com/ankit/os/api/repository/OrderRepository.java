package com.ankit.os.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ankit.os.api.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
