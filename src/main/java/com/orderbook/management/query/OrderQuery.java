package com.orderbook.management.query;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.orderbook.management.dao.entity.Order;
import com.orderbook.management.service.OrderService;

@Component
public class OrderQuery implements GraphQLQueryResolver{

	@Autowired
    private OrderService orderService;

    public List<Order> getOrders(final int count) {
        return this.orderService.getAllOrders(count);
    }

    public Optional<Order> getOrder(final int id) {
        return this.orderService.getOrder(id);
    }
}
