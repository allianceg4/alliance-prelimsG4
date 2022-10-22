package ph.com.alliance.prelims.g4.ticket.controller;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ph.com.alliance.prelims.g4.ticket.entity.Ticket;
import ph.com.alliance.prelims.g4.ticket.service.ITicketService;


@RestController
public class TicketController {
private ITicketService service;
	
	@Autowired
	public TicketController (final ITicketService service) {
		this.service = service;
	}
	
	//gets the ticket id
	@RequestMapping("/ticket/{id}")
	public String getTicketId(@PathVariable final int id) {
		return service.findById(id);
	}
	
	//gets all the ticket id
	@RequestMapping("/ticket")
	public String getAllTicket() {
		return service.findAll();
	}
	
	//post map and save ticket
	@PostMapping("/ticket")
	public int saveTicket (final HttpServletRequest request) throws IOException{
		final BufferedReader body = request.getReader();
		return service.createTicket(body);
	}
	
	//post map and update ticket assignee
	@PostMapping("/ticket/update/{id}")
	public int updateTicket(@PathVariable final int id, @RequestParam("ticket") final Ticket ticket) throws IOException {
		return service.updateTicket(ticket);
	}
	
	@PostMapping("/ticket/update/status/{id}")
	public int updateTicketStatus(@PathVariable final int id, @RequestParam("status") final String status) throws IOException {
		return service.updateTicketStatus(id, status);
	}
	
	@PostMapping("/ticket/update/assignee/{id}")
	public int updateTicketAssignee(@PathVariable final int id, @RequestParam("assignee") final String assignee) throws IOException {
		return service.updateTicketAssignee(id, assignee);
	}
	
	//deletes element
	@DeleteMapping("/ticket/delete/{id}")
	public int deleteTicket (@PathVariable final int id) throws IOException{
		return service.deleteTicket(id);
	}
	
}
