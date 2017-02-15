package com.indiatech.Enum;

/**
 * Created by Dhruti on 15/02/17.
 */
public enum UserRoleEnum {
	USER("User", 1),
	ADMIN("Admin", 2);

	private String content;
	private int number;

	UserRoleEnum(String content, int number) {
		this.content = content;
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
}
