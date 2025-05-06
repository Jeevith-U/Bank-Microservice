package com.jeevith.cards.entity;

import com.jeevith.cards.util.GenarateCustomeCardId;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Cards extends BaseEntity {

	@Id
	@GenarateCustomeCardId
	private String cardId;

	private String mobileNumber;

	private String cardNumber;

	private String cardType;

	private int totalLimit;

	private int amountUsed;

	private int availableAmount;
	
}
