package ph.com.alliance.prelims.g4.ticket.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ph.com.alliance.prelims.g4.ticket.entity.Ticket;

@Repository
public class TicketRepository implements ITicketRepository {

	@Autowired
	private JdbcTemplate template;
	
	public Ticket findById(final int id)
	{
		final String sql = "SELECT * FROM tickets WHERE ticketid=?";
		final Ticket result = template.queryForObject(sql, BeanPropertyRowMapper.newInstance(Ticket.class), id);
 
		return result;
	}
	
	public List<Ticket> findAll()
	{
		final String sql = "SELECT * FROM tickets";
		final List<Ticket> result = template.query(sql, BeanPropertyRowMapper.newInstance(Ticket.class));
 
		return result;
	}
	
	public int createTicket(final Ticket ticket)
	{
		final String sql = "INSERT INTO tickets (ticketid, assignee, status, subject, description, tracker) VALUES (?, ?, ?, ?, ?, ?)";
		final int result = template.update(sql, ticket.getTicketID(), ticket.getAssignee(), ticket.getStatus(), ticket.getSubject(), ticket.getDescription(), ticket.getTracker());
 
		return result;
	}
	
	public int updateTicket(final Ticket ticket)
	{
		final String sql = "UPDATE tickets SET assignee=?, status=?, subject=?, description=?, tracker=? WHERE ticketid=?";
		final int result = template.update(sql, ticket.getAssignee(), ticket.getStatus(), ticket.getSubject(), ticket.getDescription(), ticket.getTracker(), ticket.getTicketID());
 
		return result;
	}
	
	public int updateTicketStatus(final int id, final String status)
	{
		final String sql = "UPDATE tickets SET status=? WHERE ticketid=?";
		final int result = template.update(sql, status, id);
 
		return result;
	}
	
	public int updateTicketAssignee(final int id, final String assignee)
	{
		final String sql = "UPDATE tickets SET assignee=? WHERE ticketid=?";
		final int result = template.update(sql, assignee, id);
 
		return result;
	}
	
	public int deleteTicket(final int id)
	{
		final String sql = "DELETE FROM tickets WHERE ticketid=?";
		final int result = template.update(sql, id);
 
		return result;
	}
}
