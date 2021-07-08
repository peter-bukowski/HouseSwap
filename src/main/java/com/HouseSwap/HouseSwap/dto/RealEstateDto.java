package com.HouseSwap.HouseSwap.dto;

import com.HouseSwap.HouseSwap.Model.RealEstateListings;
import com.HouseSwap.HouseSwap.Model.User;

public class RealEstateDto {

    private String streetAddress;

    private int bedroomCount;

    private int bathroomCount;

    private String price;

    public RealEstateListings convertToHome()
    {
        RealEstateListings realEstateListings= new RealEstateListings();
        realEstateListings.setBathroomCount(bathroomCount);
        realEstateListings.setBedroomCount(bedroomCount);
        realEstateListings.setStreetAddress(streetAddress);
        realEstateListings.setPrice(price);
        return realEstateListings;
    }

}
