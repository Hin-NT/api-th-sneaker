package com.example.thsneaker.Model;

import java.io.Serializable;

public class ProductDetailID implements Serializable {
    private String image_color;

    private String image_detail;

    public ProductDetailID(String image_color, String image_detail) {
        this.image_color = image_color;
        this.image_detail = image_detail;
    }

    public ProductDetailID() {

    }
}
