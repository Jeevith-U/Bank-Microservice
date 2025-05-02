package com.jeevith.accounts.entity;

import com.jeevith.accounts.utility.GenerateCustomCustomerId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends BaseEntity {

    @Id
    @GenerateCustomCustomerId
    private String customerId;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;
}
