package com.indiatech.Enum;

/**
 * Created by Dhruti on 14/02/17.
 */
public enum ClothsSizeEnum {
	S("Small", 1),
	M("Medium", 2),
	L("Large", 3),
	XL("Extra Large", 4),
	XXL("2 XL", 5),
	BIG("Very Big", 5);

	private String content;
	private int number;

	ClothsSizeEnum(String content, int number) {
		this.content = content;
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
}
