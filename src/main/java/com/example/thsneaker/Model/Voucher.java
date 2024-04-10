package com.example.thsneaker.Model;

import javax.persistence.*;

@Entity
@Table(name = "voucher")
public class Voucher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "price")
    private int price;

    @Column(name = "user_id")
    private Long user_id;
}
