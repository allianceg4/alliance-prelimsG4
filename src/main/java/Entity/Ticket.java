package Entity;

//Ticket ID, Assignee, Status, Subject, Description, and Tracker

public class Ticket {
	private int ticketID;
	private String assignee;
	private String status;
	private String subject;
	private String description;
	private String tracker;

	
	
	
	public Ticket (final int ticketID, final String assignee, final String status, final String subject, final String description, final String tracker)
	{
		this.ticketID = ticketID;
		this.assignee = assignee;
		this.status = status;
		this.subject = subject;
		this.description = description;
		this.tracker = tracker;
	}
	
	public int getticketID() {
		return ticketID;
	}
	public void setticketID(int ticketID) {
		this.ticketID = ticketID;
	}
	public String getassignee() {
		return assignee;
	}
	public void setassignee(String assignee) {
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
	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}

	public String getTracker() {
		return tracker;
	}

	public void setTracker(String tracker) {
		this.tracker = tracker;
	}	
}