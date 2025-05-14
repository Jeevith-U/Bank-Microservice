package com.jeevith.accounts.service;

import com.jeevith.accounts.dto.CustomerDetailsDto;
import org.springframework.web.bind.annotation.RequestHeader;

public interface ICustomersService {

    CustomerDetailsDto fetchCustomerDetails(String mobileNumber, String correlationId);


}
