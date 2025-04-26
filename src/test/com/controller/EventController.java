package test.com.controller;

import com.interfaces.EventService;
import com.model.Event;

public class EventController {
    private EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    public void addEvent(Event event) {
        eventService.addEvent(event);
    }

    public void removeEvent(Event event) {
        eventService.removeEvent(event);
    }

    public void listAllEvents() {
        for (Event event : eventService.getAllEvents()) {
            System.out.println(event);
        }
    }

    public void findEventByName(String eventName) {
        Event event = eventService.findEventByName(eventName);
        if (event != null) {
            System.out.println(event);
        } else {
            System.out.println("Event not found");
        }
    }
}
