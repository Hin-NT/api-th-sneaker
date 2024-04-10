package com.example.thsneaker.Repository;

import com.example.thsneaker.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRp extends JpaRepository<Product, Long> {
}
