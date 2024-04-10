package com.example.thsneaker.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product_detail")
@IdClass(ProductDetailID.class)
public class ProductDetail implements Serializable {
    @Id
    @Column(name = "image_color")
    private String image_color;

    @Id
    @Column(name = "image_detail")
    private String image_detail;

    public ProductDetail() {

    }

    public ProductDetail(String image_color, String image_detail) {
        this.image_color = image_color;
        this.image_detail = image_detail;
    }

    public String getImage_color() {
        return image_color;
    }

    public void setImage_color(String image_color) {
        this.image_color = image_color;
    }

    public String getImage_detail() {
        return image_detail;
    }

    public void setImage_detail(String image_detail) {
        this.image_detail = image_detail;
    }
}
