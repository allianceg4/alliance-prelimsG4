package alliance.G4.ticket.entity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket {
	
	@Id
	private int ticketID;
	private int userID;
	private int statusID;
	private String subject;
	private String description;
	private Date date;
	private float amount;
	private int hasconfirm;
	private int hasproof;
	private int transaction;
	private int hasinvoice;
	private int ismatched;
	private int iscredited;
	
	public int getTicketID() {
		return ticketID;
	}
	
	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}
	
	public int getUserID() {
		return userID;
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public int getStatusID() {
		return statusID;
	}
	
	public void setStatusID(int statusID) {
		this.statusID = statusID;
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
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	public int getHasConfirm() {
		return hasconfirm;
	}

	public void setHasConfirm(int hasconfirm) {
		this.hasconfirm = hasconfirm;
	}
	
	public int getHasProof() {
		return hasproof;
	}

	public void setHasProof(int hasproof) {
		this.hasproof = hasproof;
	}
	
	public int getTransaction() {
		return transaction;
	}

	public void setTransaction(int transaction) {
		this.transaction = transaction;
	}
	
	public int getHasInvoice() {
		return hasinvoice;
	}

	public void setHasInvoice(int hasinvoice) {
		this.hasinvoice = hasinvoice;
	}
	
	public int getIsMatched() {
		return ismatched;
	}

	public void setIsMatched(int ismatched) {
		this.ismatched = ismatched;
	}
	
	public int getIsCredited() {
		return iscredited;
	}

	public void setIsCredited(int iscredited) {
		this.iscredited = iscredited;
	}

}
