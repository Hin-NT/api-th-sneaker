package com.example.thsneaker.Repository;

import com.example.thsneaker.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRp extends JpaRepository<Order, Long> {
}
