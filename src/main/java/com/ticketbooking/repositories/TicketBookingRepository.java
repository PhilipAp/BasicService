package com.ticketbooking.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ticketbooking.entities.Ticket;

@Repository
public interface TicketBookingRepository extends CrudRepository<Ticket, Integer> {

}
