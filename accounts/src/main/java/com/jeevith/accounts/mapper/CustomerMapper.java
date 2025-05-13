package com.jeevith.accounts.mapper;

import com.jeevith.accounts.dto.CustomerDetailsDto;
import com.jeevith.accounts.dto.CustomerDto;
import com.jeevith.accounts.entity.Customer;

public class CustomerMapper {

    public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
        customerDto.setCustomerName(customer.getCustomerName());
        customerDto.setCustomerEmail(customer.getCustomerEmail());
        customerDto.setCustomerPhoneNumber(customer.getCustomerPhoneNumber());
        return customerDto;
    }

    public static CustomerDetailsDto mapToCustomerDetailsDto(Customer customer, CustomerDetailsDto customerDetailsDto) {
        customerDetailsDto.setName(customer.getCustomerName());
        customerDetailsDto.setEmail(customer.getCustomerEmail());
        customerDetailsDto.setMobileNumber(customer.getCustomerPhoneNumber());
        return customerDetailsDto;
    }

    public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
        customer.setCustomerName(customerDto.getCustomerName());
        customer.setCustomerEmail(customerDto.getCustomerEmail());
        customer.setCustomerPhoneNumber(customerDto.getCustomerPhoneNumber());
        return customer;
    }
}
