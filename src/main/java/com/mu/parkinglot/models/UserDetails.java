package com.mu.parkinglot.models;

import lombok.Data;

@Data
public class UserDetails {

	private Integer regsitrationNumber;
	
	private String name;
	
	private Vehicle vehicle;
	
}
