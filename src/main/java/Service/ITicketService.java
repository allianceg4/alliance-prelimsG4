package Service;

import java.io.BufferedReader;

import Entity.Ticket;

public interface ITicketService {
	public String findById(final int id);
	public String findAll();
	public int createTicket(final BufferedReader body);
	public int updateTicket(final Ticket ticket);
	public int updateTicketStatus(final int id, final String status);
	public int updateTicketAssignee(final int id, final String assignee);
	public int deleteTicket(final int id);
	
}
