package com.example.thsneaker.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "product_discount")
public class Discount implements Serializable {
    @Id
    @Column(name = "discount_id")
    private Long discountId;

    @Column(name = "product_id")
    private Long productId;

    @Column(name ="discount")
    private String discount;

    @Column(name ="percent")
    private int percent;

    @Column(name ="status")
    private int status;

    public Discount() {

    }

    public Discount(Long productId, Long discountId, String discount, int percent, int status) {
        this.productId = productId;
        this.discountId = discountId;
        this.discount = discount;
        this.percent = percent;
        this.status = status;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
