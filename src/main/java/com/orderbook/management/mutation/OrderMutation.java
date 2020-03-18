package com.orderbook.management.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.orderbook.management.dao.entity.Order;
import com.orderbook.management.service.OrderService;

@Component
public class OrderMutation implements GraphQLMutationResolver {

	@Autowired
	private OrderService orderService;

    public Order createOrder(final String type, final String modelCode, final String brandName, final String launchDate) {
        return this.orderService.createOrder(type, modelCode, brandName, launchDate);
    }
}
