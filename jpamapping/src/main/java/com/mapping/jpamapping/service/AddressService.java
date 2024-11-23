package com.mapping.jpamapping.service;


import com.mapping.jpamapping.entities.Address;
import com.mapping.jpamapping.entities.Student;
import com.mapping.jpamapping.repository.AddressRepository;
import com.mapping.jpamapping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    // Save address
    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }
}









/*@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

   *//* public Address getAddressById(Integer addressId) {
        return addressRepository.findById(addressId).orElse(null);
    }*//*
}*/
