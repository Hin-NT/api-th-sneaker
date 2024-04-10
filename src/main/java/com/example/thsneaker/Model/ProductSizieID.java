package com.example.thsneaker.Model;

import java.io.Serializable;

public class ProductSizieID implements Serializable {
    private String image_color;
    private int size_id;

    public ProductSizieID() {
    }

    public ProductSizieID(String image_color, int size_id) {
        this.image_color = image_color;
        this.size_id = size_id;
    }
}
