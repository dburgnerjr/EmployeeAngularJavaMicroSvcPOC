package com.danielburgnerjr.address_microsvc.service;

import com.danielburgnerjr.address_microsvc.entity.Address;
import com.danielburgnerjr.address_microsvc.repository.AddressRepo;
import com.danielburgnerjr.address_microsvc.response.AddressResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class AddressService {

    @Autowired
    private AddressRepo addressRepo;

    @Autowired
    private ModelMapper mapper;

    public AddressResponse getAddressById(int id) {
        Optional<Address> address = addressRepo.findById(id);
        AddressResponse addressResponse = mapper.map(address, AddressResponse.class);
        return addressResponse;
    }
}
