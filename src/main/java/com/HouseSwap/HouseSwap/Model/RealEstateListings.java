package com.HouseSwap.HouseSwap.Model;


import lombok.Data;
import javax.persistence.*;


@Entity
@Data
@Table(name="listings")
public class RealEstateListings {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    @Column(name="streetAddress")
    private String streetAddress;

    @Column(name="bedroomCount")
    private int bedroomCount;

    @Column(name="bathroomCount")
    private int bathroomCount;

    @Column(name="price")
    private String price;

}
