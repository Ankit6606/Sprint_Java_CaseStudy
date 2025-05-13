# 1. Event Ticket Booking System

**Problem Statement:**
Build a Java-based Event Ticket Booking System where users can register, book tickets for
events, and admins can manage events. Apply OOP principles and ensure persistence using
file handling.
**Key Classes and Features:**

1. **Abstract Class: User**
    ○ Fields: protected String id, protected String name
    ○ Constructor: User(String id, String name)
    ○ Abstract method: void showProfile()
2. **Attendee extends User**
    ○ Constructor: Attendee(String id, String name)
    ○ Overrides showProfile() to display attendee info
3. **Organizer extends User**
    ○ Field: boolean active = true
    ○ Methods: boolean isActive(), void setActive(boolean)
    ○ Overrides showProfile() to display status
4. **Event**
    ○ Fields: String title, int availableTickets
    ○ Constructor: Event(String title, int availableTickets)
    ○ Methods: boolean isAvailable(), void setAvailableTickets(int)
5. **Ticket**


```
○ Fields: Attendee attendee, Event event, String status
○ Constructor: initializes status = "Booked"
○ Methods: void cancel(), String getStatus(), String
ticketDetails()
```
6. **Custom Exception:** InvalidBookingException
7. **Annotation:** @RoleRequired(role = "Admin")
8. **Admin extends User**
    ○ Annotated with @RoleRequired
    ○ Method: void removeEvent(List<Event> events, String title)
       using reflection
    ○ Iterator for safe removal
9. **EventBookingSystem**
    ○ Lists: List<Attendee>, List<Organizer>, List<Event>, List<Ticket>
    ○ Methods: registerUser, addEvent, bookTicket, saveEvents(), loadEvents(),
       showEvents()
10. **Main Class**
● Load events on startup
● Menu: Register Attendee, Add Event, Book Ticket, Show Events, Save & Exit


