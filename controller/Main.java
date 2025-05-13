package controller;

import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		loadEvents();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welecome to Event Ticket Booking System !");
		
		while(true) {
			System.out.println("1 : Register Attendee.");
			System.out.println("2 : Add Event.");
			System.out.println("3 : Book Ticket.");
			System.out.println("4 : Show Events.");
			System.out.println("5 : Save & Exit.");
			
			int n = sc.nextInt();
			
			switch(n) {
				case 1: {
					System.out.println("Enter id : ");
					String id = sc.next();
					System.out.println("Enter name : ");
					String name = sc.next();
					Attendee attendee = new Attendee(id, name);
					registerUser(attendee);
					break;
				}
				case 2: {
					System.out.println("Enter title : ");
					String title = sc.next();
					System.out.println("Enter available Tickets : ");
					int availableTickets = sc.nextInt();
					Event event = new Event(title, availableTickets);
					addEvent(event);
					break;
				}
				case 3: {
					Ticket ticket = new Ticket("Booked");
					bookTicket(ticket);
					break;
				}
				case 4: {
					showEvents();
					break;
				}
				default: {
					saveEvents();
					System.exit(0);
				}
			}
		}
	}
}
