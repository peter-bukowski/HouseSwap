package com.HouseSwap.HouseSwap.Model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="offer")
public class Offer {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;


    @Column(name="username")
    private String username;

    @Column(name="address")
    private String address;

    @Column(name="offerPrice")
    private String offerPrice;


}
