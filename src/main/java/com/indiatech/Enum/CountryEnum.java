package com.indiatech.Enum;

/**
 * Created by Dhruti on 15/02/17.
 */
public enum CountryEnum {
	INDIA("India", 1);

	private String content;
	private int number;

	CountryEnum(String content, int number) {
		this.content = content;
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
}
