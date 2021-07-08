package com.HouseSwap.HouseSwap.Controller;


import com.HouseSwap.HouseSwap.Model.RealEstateListings;
import com.HouseSwap.HouseSwap.Repository.IRealEstateRepository;
import com.HouseSwap.HouseSwap.dto.RealEstateDto;
import com.HouseSwap.HouseSwap.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("api/listings")
public class RealEstateController {


    @Autowired
    IRealEstateRepository realEstateRepository;


    @GetMapping
    public List<RealEstateListings> displayAll(){

       return realEstateRepository.findAll();
    }

    @PostMapping("sellhome")
    public RealEstateListings uploadListing(@RequestBody RealEstateListings realEstateListings) //@Valid provides validation check
    {


        return realEstateRepository.save(realEstateListings);

    }

}
