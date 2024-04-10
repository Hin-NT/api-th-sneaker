package com.example.thsneaker.Repository;

import com.example.thsneaker.Model.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRp extends JpaRepository<Discount, Long> {
}
