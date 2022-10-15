package Controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import Service.TicketService;

@RestController
public class TicketController {

	private TicketService service;
	
	@Autowired
	public TicketService TicketController (final TicketService service) {
		return this.service=service;
	}
	
	public String getTicketId(@PathVariable final int id) {
		return "";
	}
	
	public String getAll() {
		return "";
	}
	
	public int save (final HttpServletRequest request) throws IOException{
		return 0;
	}
	
	public int delete (@PathVariable final int id) throws IOException{
		return 0;
	}
}
