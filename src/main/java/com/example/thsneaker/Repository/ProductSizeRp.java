package com.example.thsneaker.Repository;

import com.example.thsneaker.Model.ProductColor;
import com.example.thsneaker.Model.ProductSize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductSizeRp extends JpaRepository<ProductSize, String> {
    @Query("SELECT ip FROM ProductSize ip WHERE ip.image_color = :image_color")
    List<ProductSize> findSizeByImage(@Param("image_color") String image_color);
}
