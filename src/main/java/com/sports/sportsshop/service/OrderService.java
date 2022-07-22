package com.sports.sportsshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sports.sportsshop.model.Orders;

@Service
public interface OrderService {

		public Orders addOrder(Orders order);
		
		public Orders removeOrder(long orderId);

		public Orders updateOrder(Orders order);
		
		public Orders getOrderDetails(long orderId);
		
		public List<Orders> getAllOrders();

		
}



