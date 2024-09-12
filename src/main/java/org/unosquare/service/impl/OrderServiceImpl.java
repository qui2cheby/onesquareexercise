package org.unosquare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.unosquare.repository.OrderRepository;
import org.unosquare.service.OrderService;
import org.unosquare.vo.Order;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.saveAndFlush(order);
    }

    @Override
    public Order getBy(Long id) {
        return orderRepository.findById(id).orElse(new Order());
    }
}
