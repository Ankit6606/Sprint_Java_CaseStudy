package Utility;

public class Event {
    private String title;
    private int availableTickets;

    public Event(String title, int availableTickets) {
        this.title = title;
        this.availableTickets = availableTickets;
    }

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getAvailableTickets() {
		return availableTickets;
	}
	public void setAvailableTickets(int availableTickets) {
		this.availableTickets = availableTickets;
	}
    
	public boolean isAvailable() {
		return availableTickets > 0;
	}
	   
}