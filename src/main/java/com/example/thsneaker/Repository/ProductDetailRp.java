package com.example.thsneaker.Repository;

import com.example.thsneaker.Model.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailRp extends JpaRepository<ProductDetail, String> {
}
