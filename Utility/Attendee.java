package Utility;

public class Attendee extends User{

	public Attendee(String id, String name) {
		super(id, name);
	}
	
	@Override
	public void showProfile() {
		System.out.println("-:Attendee Profile:-");
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
	}

}
