package com.danielburgnerjr.address_microsvc.configuration;

import com.danielburgnerjr.address_microsvc.service.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressConfiguration {
    @Bean
    public AddressService addressBean() {
        return new AddressService();
    }

    @Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }
}
