package ph.com.alliance.prelims.g4.ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ph.com.alliance.prelims.g4.ticket.entity.Ticket;

@Repository
public interface ITicketRepository extends JpaRepository<Ticket, Integer>{

}
