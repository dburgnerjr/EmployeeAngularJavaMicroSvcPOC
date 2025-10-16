package com.danielburgnerjr.address_microsvc.controller;

import com.danielburgnerjr.address_microsvc.response.AddressResponse;
import com.danielburgnerjr.address_microsvc.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping("/addresses/{id}")
    private ResponseEntity<AddressResponse> getEmployeeDetails(@PathVariable("id") int id) {
        AddressResponse address = addressService.getAddressById(id);
        return ResponseEntity.status(HttpStatus.OK).body(address);
    }
}
