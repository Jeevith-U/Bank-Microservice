package com.jeevith.cards.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

// record classes are the simple data-carrying classes.

@ConfigurationProperties(prefix = "cards")
@Getter
@Setter
@AllArgsConstructor
public class CardsContactInfoDto{

    private String message;
    private Map<String, String> contactDetails ;
    private List<String> onCallSupport ;
}
