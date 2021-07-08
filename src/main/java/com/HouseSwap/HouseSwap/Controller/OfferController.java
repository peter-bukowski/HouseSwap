package com.HouseSwap.HouseSwap.Controller;


import com.HouseSwap.HouseSwap.Model.Offer;
import com.HouseSwap.HouseSwap.Repository.IOfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/offer")
public class OfferController {


    @Autowired
    IOfferRepository offerRepository;

    @PostMapping
    public Offer sendOffer(@RequestBody  Offer offer){
        return offerRepository.save(offer);
    }

    @GetMapping("alloffers")
    public List<Offer> getallOffers(){
        return offerRepository.findAll();
    }
}
