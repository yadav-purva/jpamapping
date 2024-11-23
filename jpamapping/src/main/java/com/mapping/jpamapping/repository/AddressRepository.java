package com.mapping.jpamapping.repository;

import com.mapping.jpamapping.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
