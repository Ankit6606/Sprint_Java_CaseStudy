package Utility;

public class Ticket {
	private Attendee attendee;
	private Event event;
	private String status;
	
	public Ticket(Attendee attendee, Event event, String status) {
	this.attendee = attendee;
	this.event = event;
	this.status = "Booked";
}

	public void cancel() {
		this.status = "Cancelled";
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Ticket [attendee=" + attendee + ", event=" + event + ", status=" + status + "]";
	}
}
	