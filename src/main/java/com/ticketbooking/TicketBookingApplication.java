package com.ticketbooking;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ticketbooking.entities.Ticket;
import com.ticketbooking.services.TicketBookingService;

@SpringBootApplication
public class TicketBookingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(TicketBookingApplication.class, args);
		
		TicketBookingService ticketBookingService = applicationContext.getBean("ticketBookingService", TicketBookingService.class);
		
		Ticket ticket = new Ticket();
		ticket.setPassengerName("George");
		ticket.setEmail("george@gmail.com");
		ticket.setSourceDestination("Dubai");
		ticket.setBookingDate(LocalDate.now());			
		ticketBookingService.createTicket(ticket);
	}
}
