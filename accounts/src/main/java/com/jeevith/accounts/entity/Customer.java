package com.jeevith.accounts.entity;

import com.jeevith.accounts.utility.GenerateCustomCustomerId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @GenerateCustomCustomerId
    private String customerId;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
}
