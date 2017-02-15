package com.indiatech.Enum;

/**
 * Created by Dhruti on 15/02/17.
 */
public enum StateEnum {
	GUJRAT("Gujrat", 1, 1);

	private String content;
	private int countryNum;
	private int number;

	StateEnum(String content, int number, int countryNum) {
		this.content = content;
		this.number = number;
		this.countryNum = countryNum;
	}

	public int getCountryNum() {
		return countryNum;
	}

	public int getNumber() {
		return number;
	}
}
