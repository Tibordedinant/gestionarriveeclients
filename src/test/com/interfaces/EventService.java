package test.com.interfaces;

import java.util.List;

import com.model.Event;

public interface EventService {
    void addEvent(Event event);
    void removeEvent(Event event);
    List<Event> getAllEvents();
    Event findEventByName(String eventName);
}
