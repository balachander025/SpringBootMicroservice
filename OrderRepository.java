package com.bala.micoservice_order.repository;

import com.bala.micoservice_order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {


}
