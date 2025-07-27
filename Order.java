package com.bala.micoservice_order.model;

import jakarta.persistence.*;

@Entity(name="orders_table")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="product_id",nullable = false)
    private Long productid;

    @Column(nullable = false)
    private int quantity;

    public Order(){}
    public Order(Long productid,int quantity) {
        this.productid=productid;
        this.quantity=quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
