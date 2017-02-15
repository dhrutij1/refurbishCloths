package com.indiatech.Enum;

/**
 * Created by Dhruti on 15/02/17.
 */
public enum TrasactionStatusEnum {
	ORDER("Order", 1),
	SHIPPED("Shipped", 2),
	DELIVER("Deliver", 3),
	CANCEL("Cancel", 4),
	DONE("Done", 5);

	private String content;
	private int number;

	TrasactionStatusEnum(String content, int number) {
		this.content = content;
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
}
