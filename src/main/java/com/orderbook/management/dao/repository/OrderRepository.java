package com.orderbook.management.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orderbook.management.dao.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}

