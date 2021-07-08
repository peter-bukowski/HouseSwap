package com.HouseSwap.HouseSwap.Repository;

import com.HouseSwap.HouseSwap.Model.RealEstateListings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRealEstateRepository extends JpaRepository<RealEstateListings, Long> {


}
