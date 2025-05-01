package com.jeevith.accounts.repository;

import com.jeevith.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

    Optional<Customer> findByCustomerPhoneNumber(String customerPhoneNumber);
}
