package ph.com.alliance.prelims.g4.ticket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ph.com.alliance.prelims.g4.ticket.entity.Ticket;
import ph.com.alliance.prelims.g4.ticket.repository.ITicketRepository;

@Service
public class TicketService implements ITicketService {

	@Autowired
	private ITicketRepository repository;
	
	public String findById(final int id)
	{
		return null; //to be changed
	}
	
	public String findAll()
	{
		return null; //to be changed
	}
	
	public int createTicket(Ticket ticket)
	{
		return 1; //to be changed
	}
	
	public int updateTicket(final Ticket ticket)
	{
		return 1; //to be changed
	}
	
	public int updateTicketStatus(final int id, final String status)
	{
		return 1; //to be changed
	}
	
	public int updateTicketAssignee(final int id, final String assignee)
	{
		return 1; //to be changed
	}
	
	public int deleteTicket(final int id)
	{
		return repository.deleteTicket(id);
	}
}
