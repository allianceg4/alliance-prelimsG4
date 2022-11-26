package alliance.G4.ticket.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import alliance.G4.common.models.ApiResponse;
import alliance.G4.ticket.entity.Ticket;
import alliance.G4.ticket.messages.TicketMessages;
import alliance.G4.ticket.service.ITicketService;


@RestController
public class TicketController {
	
	@Autowired
	private ITicketService service;
	
	@PostMapping("/ticket/save")
	@ResponseBody
	public ApiResponse saveTicket(Ticket ticket) throws IOException {

		Ticket savedTicket = service.saveTicket(ticket);

		if (savedTicket != null) {
			return ApiResponse.CreateSuccess(savedTicket, TicketMessages.TICKET_SUCCESSFULLY_SAVED);
		}

		return ApiResponse.CreateError(TicketMessages.GENERIC_UNSUCCESSFUL_SAVE);
	}

	
	//gets the ticket via id
	@RequestMapping("/ticket/{id}")
	@ResponseBody
	public ApiResponse getTicket(@PathVariable int id) throws IOException {

		Optional<Ticket> retrievedTicket = service.findById(id);

		if (retrievedTicket != null) {
			return ApiResponse.CreateSuccess(retrievedTicket, TicketMessages.TICKET_SUCCESS_RETRIEVE);
		}

		return ApiResponse.CreateError(TicketMessages.TICKET_FAILED_RETRIEVE);
	}
	
	
	//gets all the ticket
	@RequestMapping("/ticket")
	@ResponseBody
	public ApiResponse getAll() throws IOException {

		List<Ticket> retrievedTickets = service.findAll();

		if (retrievedTickets != null) {
			return ApiResponse.CreateSuccess(retrievedTickets, TicketMessages.TICKET_SUCCESS_RETRIEVE_ALL);
		}

		return ApiResponse.CreateError(TicketMessages.TICKET_FAILED_RETRIEVE_ALL);
	}
	
	

	//deletes the ticket via id
	@DeleteMapping("/ticket/delete/{id}")
	@ResponseBody
	public ApiResponse deleteTicket(@PathVariable int id) throws IOException {

		service.deleteTicket(id);
		
		return ApiResponse.CreateSuccess(TicketMessages.TICKET_SUCCESS_DELETE);
	}
	
}
