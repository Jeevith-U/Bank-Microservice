package com.jeevith.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponseDto {

    private String APIPath ;
    private int statusCode ;
    private String message;
    private LocalDateTime errorTime ;
}
