package ph.com.alliance.prelims.g4.ticket.service;

import java.io.BufferedReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import ph.com.alliance.prelims.g4.ticket.entity.Ticket;
import ph.com.alliance.prelims.g4.ticket.repository.ITicketRepository;

@Service
public class TicketService implements ITicketService {
	private ITicketRepository repository;
	private Gson gson;
	
	@Autowired
	public TicketService(final ITicketRepository repository)
	{
		this.repository = repository;
		this.gson = new Gson();
	}
	
	public String findById(final int id)
	{
		return gson.toJson(repository.findById(id));
	}
	
	public String findAll()
	{
		return gson.toJson(repository.findAll());
	}
	
	public int createTicket(Ticket ticket)
	{
		return repository.createTicket(ticket);
	}
	
	public int updateTicket(final Ticket ticket)
	{
		return repository.updateTicket(ticket);
	}
	
	public int updateTicketStatus(final int id, final String status)
	{
		return repository.updateTicketStatus(id, status);
	}
	
	public int updateTicketAssignee(final int id, final String assignee)
	{
		return repository.updateTicketAssignee(id, assignee);
	}
	
	public int deleteTicket(final int id)
	{
		return repository.deleteTicket(id);
	}
}
