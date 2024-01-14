package com.mu.parkinglot.models;

import java.time.Instant;

import lombok.Data;

@Data
public class ParkingTransactions {

	private  Integer userRegistrationNumber;
	
	private Instant startTime;
	
	private Instant endTime;
	
	private Double totalCost;
	
	
}
