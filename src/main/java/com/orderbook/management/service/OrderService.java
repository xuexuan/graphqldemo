package com.orderbook.management.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.orderbook.management.dao.entity.Order;
import com.orderbook.management.dao.repository.OrderRepository;

@Service
public class OrderService {

	private final OrderRepository orderRepository;
	
	public OrderService(final OrderRepository orderRepository) {
        this.orderRepository = orderRepository ;
    }

    @Transactional
    public Order createOrder(final String type,final String modelCode, final String brandName, final String launchDate) {
        final Order order = new Order();
        order.setType(type);
        order.setModelCode(modelCode);
        order.setBrandName(brandName);
        order.setLaunchDate(LocalDate.parse(launchDate));
        return this.orderRepository.save(order);
    }
    

    @Transactional(readOnly = true)
    public List<Order> getAllOrders(final int count) {
        return this.orderRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<Order> getOrder(final int id) {
        return this.orderRepository.findById(id);
    }
}
