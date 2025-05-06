package com.jeevith.cards.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

// record classes are the simple data-carrying classes.

@ConfigurationProperties(prefix = "cards")
public record CardsContactInfoDto(String message, Map<String, String> contactDetails, List<String> onCallSupport) {
}
