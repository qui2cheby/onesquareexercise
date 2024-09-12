package org.unosquare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.unosquare.vo.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
