package com.ticketbooking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticketbooking.entities.Ticket;
import com.ticketbooking.repositories.TicketBookingRepository;

@Service
public class TicketBookingService {
	
	@Autowired
	private TicketBookingRepository ticketBookingRepository;

	public Ticket createTicket(Ticket ticket) {
		return ticketBookingRepository.save(ticket);
	}

	public Ticket getTicketById(Integer ticketId) {
		return ticketBookingRepository.findOne(ticketId);
	}

	public Iterable<Ticket> getAllBookedTickets() {
		return ticketBookingRepository.findAll();
	}

	public void deleteTicket(Integer ticketId) {
		ticketBookingRepository.delete(ticketId);
	}

	public Ticket updateTicket(Integer ticketId, String newEmail) {
		Ticket ticketFromDB = new Ticket();
		ticketFromDB.setEmail(newEmail);
		Ticket updatedTicket = ticketBookingRepository.save(ticketFromDB);
		return updatedTicket;
	}
	
	

}
