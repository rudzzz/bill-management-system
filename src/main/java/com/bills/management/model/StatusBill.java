package com.bills.management.model;

public enum StatusBill {
	PENDENT("Pendent"),
	RECEIVED("Received");
	
	private String description;
	
	StatusBill(String description){
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
}
