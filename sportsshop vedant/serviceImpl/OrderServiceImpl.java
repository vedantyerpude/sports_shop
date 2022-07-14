package com.sports.sportsshop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sports.sportsshop.model.Order;
import com.sports.sportsshop.repo.OrderRepo;
import com.sports.sportsshop.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderRepo orderRepo;
	

	@Override
	public Order addOrder(Order order) {
		orderRepo.save(order);
		return order;
	}

	@Override
	public Order removeOrder(long orderId) {
		Order o=orderRepo.findById(orderId).get();
		orderRepo.delete(o);
		return o;
	}

	@Override
	public Order updateOrder(long orderId, Order order) {
		Order o2=orderRepo.findById(orderId).get();
		orderRepo.save(o2);
		return o2;
	}

	@Override
	public Order getOrderDetails(long orderId) {
		Order o1=orderRepo.findById(orderId).get();
		return o1;
	}

	@Override
	public List<Order> getAllOrders() {
		return orderRepo.findAll();
	}

}
