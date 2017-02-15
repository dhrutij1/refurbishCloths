package com.indiatech.Enum;

/**
 * Created by Dhruti on 15/02/17.
 */
public enum CityEnum {
	AHMEDABAD("Ahmedabad", 1, 1),
	VADODARA("Vadodara", 2, 1);

	private String content;
	private int stateNum;
	private int number;

	CityEnum(String content, int number, int stateNum) {
		this.content = content;
		this.number = number;
		this.stateNum = stateNum;
	}

	public int getNumber() {
		return number;
	}

	public int getStateNum() {
		return stateNum;
	}

}
