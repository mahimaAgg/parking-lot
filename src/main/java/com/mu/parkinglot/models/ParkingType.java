package com.mu.parkinglot.models;

import lombok.Data;

@Data
public enum ParkingType {

	SMALL("small", 10),
	
	MEDIUM("medium", 15),
	
	LARGE("large", 20);
	
	private final String type;
	private final Integer cost;
	
	ParkingType(String type, Integer cost){
		this.type = type;
		this.cost = cost;
	}
	
}
