package com.jeevith.accounts.dto;

public record AccountsMsgDto(
        long accountNumber, String name, String email, String mobileNumber
){}