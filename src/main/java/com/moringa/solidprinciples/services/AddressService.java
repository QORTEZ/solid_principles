package com.moringa.solidprinciples.services;

import com.moringa.solidprinciples.models.Address;
import com.moringa.solidprinciples.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public Address saveAddress(String streetName) {
        Address address = new Address(streetName);
        if (addressRepository.findByStreetName(streetName) != null) {
            return addressRepository.findByStreetName(streetName);
        }
        return addressRepository.save(address);
    }
}
