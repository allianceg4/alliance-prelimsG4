package alliance.G4.ticket.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alliance.G4.ticket.entity.Ticket;
import alliance.G4.ticket.repository.TicketRepository;

@Service
public class TicketService implements ITicketService {

	@Autowired
	private TicketRepository repository;
	
	public Optional<Ticket> findById(int id){
		return repository.findById(id);
	}
	
	public List<Ticket> findAll(){
		return repository.findAll();
	}
	
	public Ticket saveTicket(Ticket ticket){
		return repository.saveAndFlush(ticket);
	}
	
	public void deleteTicket(int id){
		repository.deleteById(id);
	}
	
}
