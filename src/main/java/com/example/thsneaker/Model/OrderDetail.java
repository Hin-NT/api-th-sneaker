package com.example.thsneaker.Model;

import javax.persistence.*;

@Entity
@Table(name="order_detail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "product_image")
    private String product_image;

    @Column(name = "product_size")
    private int product_size;

    @Column(name = "product_name")
    private String product_name;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "total")
    private int total;

    @Column(name = "order_id")
    private int order_id;

    public OrderDetail() {

    }

    public OrderDetail(Long id, String product_image, int product_size, String product_name, int quantity, int total, int order_id) {
        this.id = id;
        this.product_image = product_image;
        this.product_size = product_size;
        this.product_name = product_name;
        this.quantity = quantity;
        this.total = total;
        this.order_id = order_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    public int getProduct_size() {
        return product_size;
    }

    public void setProduct_size(int product_size) {
        this.product_size = product_size;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
}
