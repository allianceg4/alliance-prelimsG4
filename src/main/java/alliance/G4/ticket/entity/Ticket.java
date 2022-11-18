package alliance.G4.ticket.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

//Ticket ID, Assignee, Status, Subject, Description, and Tracker

@Entity
public class Ticket {
	
	@Id
	private int ticketID;
	private String assignee;
	private String status;
	private String subject;
	private String description;
	private String tracker;
	
	public int getTicketID() {
		return ticketID;
	}
	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}
	public String getAssignee() {
		return assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}	
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTracker() {
		return tracker;
	}

	public void setTracker(String tracker) {
		this.tracker = tracker;
	}	
}
