package com.jeevith.Loans.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

// record classes are the simple data-carrying classes.

@ConfigurationProperties(prefix = "loans")
public record LoansContactInfoDto(String message, Map<String, String> contactDetails, List<String> onCallSupport) {
}
