package com.example.thsneaker.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product_color")
@IdClass(ProductColorID.class)
public class ProductColor implements Serializable {
    @Id
    @Column(name = "product_id")
    private Long product_id;

    @Id
    @Column(name = "image_color")
    private String image_color;

    public ProductColor() {

    }

    public ProductColor(Long product_id, String image_color) {
        this.product_id = product_id;
        this.image_color = image_color;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getImage_color() {
        return image_color;
    }

    public void setImage_color(String image_color) {
        this.image_color = image_color;
    }
}
