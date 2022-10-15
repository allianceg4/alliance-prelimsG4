package Repository;

import java.util.List;

import Entity.Ticket;

public interface ITicketRepository {
	public Ticket findById(final int id);
	public List<Ticket> findAll();
	public int createTicket(final Ticket ticket);
	public int updateTicket(final Ticket ticket);
	public int updateTicketStatus(final Ticket ticket);
	public int updateTicketAssignee(final Ticket ticket);
	public int deleteTicket(final int id);
	
}
