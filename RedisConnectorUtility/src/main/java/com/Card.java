/**
 * 
 */
package com;

import java.io.Serializable;

/**
 * @author ranjan
 *
 */
public final class Card implements Serializable {

	private static final long serialVersionUID = 1L;
	private final long cardNumber;
	private final String cardType;

	public Card(long cardNumber, String cardType) {
		super();
		this.cardNumber = cardNumber;
		this.cardType = cardType;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public String getCardType() {
		return cardType;
	}

	@Override
	public String toString() {
		return "Card [cardNumber=" + cardNumber + ", cardType=" + cardType + "]";
	}
}
