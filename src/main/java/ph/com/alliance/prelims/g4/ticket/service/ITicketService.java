package ph.com.alliance.prelims.g4.ticket.service;

import java.io.BufferedReader;

import ph.com.alliance.prelims.g4.ticket.entity.Ticket;

public interface ITicketService {
	public String findById(final int id);
	public String findAll();
	public int createTicket(final BufferedReader body);
	public int updateTicket(final Ticket ticket);
	public int updateTicketStatus(final int id, final String status);
	public int updateTicketAssignee(final int id, final String assignee);
	public int deleteTicket(final int id);
}
