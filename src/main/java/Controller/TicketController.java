package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import Service.TicketService;


@RestControllerAdvice
public class TicketController {
	
	private TicketService service ;
	
@Autowired
	public TicketService ticketController (final TicketService service) {
	return this.service = service;
	}
	
}
