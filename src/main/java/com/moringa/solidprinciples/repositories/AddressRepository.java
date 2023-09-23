package com.moringa.solidprinciples.repositories;

import com.moringa.solidprinciples.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {

    Address findByStreetName(String streetName);
}
