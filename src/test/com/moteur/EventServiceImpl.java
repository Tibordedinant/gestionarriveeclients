package test.com.moteur;

import java.util.ArrayList;
import java.util.List;

import com.interfaces.EventService;
import com.model.Event;

public class EventServiceImpl implements EventService {
    private List<Event> events = new ArrayList<>();

    @Override
    public void addEvent(Event event) {
        events.add(event);
    }

    @Override
    public void removeEvent(Event event) {
        events.remove(event);
    }

    @Override
    public List<Event> getAllEvents() {
        return new ArrayList<>(events);
    }

    @Override
    public Event findEventByName(String eventName) {
        for (Event event : events) {
            if (event.getEventName().equals(eventName)) {
                return event;
            }
        }
        return null;
    }
}
