package com.jeevith.accounts.service.client;

import com.jeevith.accounts.dto.CardsDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "cards", fallback = CardsFallBack.class) // registered name in the eureka server
public interface CardsFeignClient {

    @GetMapping(value = "/api/cards",consumes = "application/json")
    public ResponseEntity<CardsDto> fetchCardDetails(@RequestParam String mobileNumber, @RequestHeader("bank-correlation-id")String correlationId);
}
