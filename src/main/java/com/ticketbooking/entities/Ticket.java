package com.ticketbooking.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Ticket implements Serializable {
		
	private static final long serialVersionUID = -5563825123759797516L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer ticketId;
	private String passengerName;
	private LocalDate bookingDate;
	private String sourceDestination;
	private String email;
	

}
