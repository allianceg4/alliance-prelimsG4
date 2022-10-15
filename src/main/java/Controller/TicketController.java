package Controller;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Entity.Ticket;
import Service.TicketService;

@RestController
public class TicketController {

	private TicketService service;
	
	@Autowired
	public TicketService TicketController (final TicketService service) {
		return this.service=service;
	}
	
	//gets the ticket id
	public String getTicketId(@PathVariable final int id) {
		return service.findById(id);
	}
	
	//gets all the ticket id
	public String getAllTicket() {
		return service.findAll();
	}
	
	//post map and save ticket
	@PostMapping("/user/{id}")
	public int saveTicket (final HttpServletRequest request) throws IOException{
		final BufferedReader body = request.getReader();
		return service.createTicket(body);
	}
	
	//post map and update ticket assignee
	@PostMapping("/user/{id}")
	public int save(@PathVariable final int id, @RequestParam("ticket") final Ticket ticket, @RequestParam("assginee") final String assignee) throws IOException {
		return service.updateTicketAssignee(ticket, assignee);
	}
	
	//deletes element
	@DeleteMapping("/user/delete/{id}")
	public int deleteTicket (@PathVariable final int id) throws IOException{
		return service.deleteTicket(id);
	}
	
	}
	
