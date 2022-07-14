package com.sports.sportsshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sports.sportsshop.model.Order;

@Service
public interface OrderService {

		Order addOrder(Order order);
		
		Order removeOrder(long orderId);

		Order updateOrder(long orderId,Order order);
		
		Order getOrderDetails(long orderId);
		
		List<Order> getAllOrders();

		
}



