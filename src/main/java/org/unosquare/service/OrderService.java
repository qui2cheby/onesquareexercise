package org.unosquare.service;

import org.unosquare.vo.Order;

public interface OrderService {

    Order saveOrder(Order order);

    Order getBy(Long id);
}
