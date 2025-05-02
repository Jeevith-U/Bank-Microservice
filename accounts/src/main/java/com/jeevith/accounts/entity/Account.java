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
public class Account extends  BaseEntity {

    private String customerId;

    @Id
    private long accountNumber;
    private String accountType;
    private String branchAddress;
}
