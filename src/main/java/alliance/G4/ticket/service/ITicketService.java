package alliance.G4.ticket.service;

import java.util.List;
import java.util.Optional;

import alliance.G4.ticket.entity.Ticket;

public interface ITicketService {
	public Optional<Ticket> findById(int id);
	public List<Ticket> findAll();
	public Ticket saveTicket(Ticket ticket);
	public void deleteTicket(int id);
}
