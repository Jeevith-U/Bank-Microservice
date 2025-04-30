package com.jeevith.accounts.dto;

import com.jeevith.accounts.utility.GenerateCustomCustomerId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

    private String customerName;
    private String customerEmail;
    private String customerPhone;
}
