package com.danielburgnerjr.address_microsvc.repository;

import com.danielburgnerjr.address_microsvc.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Integer> {
}
