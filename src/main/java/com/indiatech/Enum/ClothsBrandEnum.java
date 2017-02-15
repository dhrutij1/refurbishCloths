package com.indiatech.Enum;

/**
 * Created by Dhruti on 14/02/17.
 */
public enum ClothsBrandEnum {
	CALVINKLEIN("Calvin Klein", 1),
	TOMMYHILFIGER("Tommy Hilfiger", 2),
	LOUISVITTON("Louis Vitton", 3),
	GUESS("Guess", 4),
	NIKE("Nike XL", 5),
	ADIDAS("Adidas", 5);

	private String content;
	private int number;

	ClothsBrandEnum(String content, int number) {
		this.content = content;
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
}

