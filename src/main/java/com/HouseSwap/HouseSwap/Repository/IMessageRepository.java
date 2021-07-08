package com.HouseSwap.HouseSwap.Repository;

import com.HouseSwap.HouseSwap.Model.Messages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMessageRepository extends JpaRepository<Messages, Long > {


}
