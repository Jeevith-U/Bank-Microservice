package com.jeevith.Loans.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

// record classes are the simple data-carrying classes.

@ConfigurationProperties(prefix = "loans")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoansContactInfoDto{

    private String message;
    private Map<String, String> contactDetails ;
    private List<String> onCallSupport ;
}
