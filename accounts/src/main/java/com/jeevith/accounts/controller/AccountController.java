package com.jeevith.accounts.controller;

import com.jeevith.accounts.dto.CustomerDto;
import com.jeevith.accounts.dto.ResponseDto;
import com.jeevith.accounts.service.IAccountsService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path="/public/api", produces = {MediaType.APPLICATION_JSON_VALUE})
public class AccountController {

    @Autowired
    private IAccountsService iAccountsService;


    @PostMapping("/account")
    public ResponseEntity<ResponseDto> createAccount(@Valid @RequestBody CustomerDto customerDto) {
        iAccountsService.createAccount(customerDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(HttpStatus.CREATED.value() , HttpStatus.CREATED.getReasonPhrase()));
    }
}
