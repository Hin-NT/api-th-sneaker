package com.example.thsneaker.Model;

import java.io.Serializable;

public class ProductColorID implements Serializable {
    private Long product_id;

    private String image_color;

    public ProductColorID(Long product_id, String image_color) {
        this.product_id = product_id;
        this.image_color = image_color;
    }

    public ProductColorID() {
    }
}
