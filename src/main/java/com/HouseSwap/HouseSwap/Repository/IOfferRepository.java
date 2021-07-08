package com.HouseSwap.HouseSwap.Repository;

import com.HouseSwap.HouseSwap.Model.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOfferRepository extends JpaRepository<Offer, Long> {
}
