package com.jeevith.accounts.dto;

import com.jeevith.accounts.utility.GenerateCustomCustomerId;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

    @NotEmpty(message = "Name can not be a null or empty")
    @Size(min = 5, max = 30, message = "The length of the customer name should be between 5 and 30")
    @Schema(description = "Customer Name", example = "Jeevith")
    private String customerName;

    @NotEmpty(message = "Email address can not be a null or empty")
    @Email(message = "Email address should be a valid value")
    @Schema(description = "Customer Email", examples = {"jeevith.u.work@gmail.com", "jeev2@outlook.com"})
    private String customerEmail;

    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    @Schema(description = "Customer Phone Number", example = "9876543210")
    private String customerPhoneNumber;

    private AccountDto accountsDto;

}
