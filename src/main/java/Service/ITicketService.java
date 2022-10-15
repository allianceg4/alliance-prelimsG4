package Service;

import java.io.BufferedReader;

import Entity.Ticket;

public interface ITicketService {
	public String findById(final int id);
	public String findAll();
	public int createTicket(final BufferedReader body);
	public int updateTicket(final Ticket ticket);
	public int updateTicketStatus(final Ticket ticket);
	public int updateTicketAssignee(final Ticket ticket);
	public int deleteTicket(final int id);
	
}
