package com.example.thsneaker.Repository;

import com.example.thsneaker.Model.ProductColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductColorRp extends JpaRepository<ProductColor, String> {
    @Query("SELECT ip FROM ProductColor ip WHERE ip.product_id = :productId")
    List<ProductColor> findImagesByProductId(@Param("productId") Long productId);
}
