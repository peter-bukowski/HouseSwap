package com.HouseSwap.HouseSwap.Repository;

import com.HouseSwap.HouseSwap.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}
