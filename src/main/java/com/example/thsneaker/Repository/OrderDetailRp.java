package com.example.thsneaker.Repository;

import com.example.thsneaker.Model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRp extends JpaRepository<OrderDetail, Long> {
}
