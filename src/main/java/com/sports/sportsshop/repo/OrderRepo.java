package com.sports.sportsshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sports.sportsshop.model.Orders;

@Repository
@Transactional
public interface OrderRepo extends JpaRepository<Orders,Long> {
	
	Orders findByOrderId(long orderId);

}
