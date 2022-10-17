package ph.com.alliance.prelims.g4.ticket.repository;

import java.util.List;

import ph.com.alliance.prelims.g4.ticket.entity.Ticket;

public interface ITicketRepository {
	public Ticket findById(final int id);
	public List<Ticket> findAll();
	public int createTicket(final Ticket ticket);
	public int updateTicket(final Ticket ticket);
	public int updateTicketStatus(final int id, final String status);
	public int updateTicketAssignee(final int id, final String assignee);
	public int deleteTicket(final int id);
}
