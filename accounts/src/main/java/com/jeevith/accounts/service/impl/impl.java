package com.jeevith.accounts.service.impl;

import com.jeevith.accounts.constants.AccountConstants;
import com.jeevith.accounts.dto.CustomerDto;
import com.jeevith.accounts.entity.Account;
import com.jeevith.accounts.entity.Customer;
import com.jeevith.accounts.exception.CustomerAlreadyExistsException;
import com.jeevith.accounts.mapper.CustomerMapper;
import com.jeevith.accounts.repository.AccountRepository;
import com.jeevith.accounts.repository.CustomerRepository;
import com.jeevith.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
@AllArgsConstructor
public class impl implements IAccountsService {

    private AccountRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {
        Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());
        Optional<Customer> optionalCustomer = customerRepository.findByCustomerPhoneNumber(customerDto.getCustomerPhoneNumber());
        if(optionalCustomer.isPresent()) {
            throw new CustomerAlreadyExistsException("Customer already registered with given mobileNumber "
                    +customerDto.getCustomerPhoneNumber());
        }
        Customer savedCustomer = customerRepository.save(customer);
        accountsRepository.save(createNewAccount(savedCustomer));
    }


    private Account createNewAccount(Customer customer) {
        Account newAccount = new Account();
        newAccount.setCustomerId(customer.getCustomerId());
        long randomAccNumber = 1000000000L + new Random().nextInt(900000000);

        newAccount.setAccountNumber(randomAccNumber);
        newAccount.setAccountType(AccountConstants.SAVINGS);
        newAccount.setBranchAddress(AccountConstants.ADDRESS);
        return newAccount;
    }
}
