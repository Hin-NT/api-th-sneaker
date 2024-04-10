package com.example.thsneaker.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product_size")
@IdClass(ProductSizieID.class)
public class ProductSize implements Serializable {
    @Id
    @Column(name="image_color")
    private String image_color;

    @Id
    @Column(name ="size_id")
    private int size_id;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "sell")
    private int sell;

    @Column(name = "purchase_price")
    private int purchase_price;

    @Column(name = "price")
    private int price;

    public ProductSize() {

    }

    public ProductSize(String image_color, int size_id, int quantity, int sell, int purchase_price, int price) {
        this.image_color = image_color;
        this.size_id = size_id;
        this.quantity = quantity;
        this.sell = sell;
        this.purchase_price = purchase_price;
        this.price = price;
    }

    public String getImage_color() {
        return image_color;
    }

    public void setImage_color(String image_color) {
        this.image_color = image_color;
    }

    public int getSize_id() {
        return size_id;
    }

    public void setSize_id(int size_id) {
        this.size_id = size_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSell() {
        return sell;
    }

    public void setSell(int sell) {
        this.sell = sell;
    }

    public int getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(int purchase_price) {
        this.purchase_price = purchase_price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
