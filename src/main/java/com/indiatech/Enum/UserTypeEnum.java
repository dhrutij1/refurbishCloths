package com.indiatech.Enum;

/**
 * Created by Dhruti on 15/02/17.
 */
public enum UserTypeEnum {
	OWNER("Owner", 1),
	BUYER("Buyer", 2);

	private String content;
	private int number;

	UserTypeEnum(String content, int number) {
		this.content = content;
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
}
