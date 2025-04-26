package test.com.model;
import java.util.Objects;

public class Event {
    private final String eventName;
    private final String eventDate;
    private final String eventLocation;

    public Event(String eventName, String eventDate, String eventLocation) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventLocation = eventLocation;
    }

    public String getEventName() {
        return this.eventName;
    }


    public String getEventDate() {
        return this.eventDate;
    }


    public String getEventLocation() {
        return this.eventLocation;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Event)) {
            return false;
        }
        Event event = (Event) o;
        return Objects.equals(eventName, event.eventName) && Objects.equals(eventDate, event.eventDate) && Objects.equals(eventLocation, event.eventLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventName, eventDate, eventLocation);
    }

    @Override
    public String toString() {
        return "{" +
            " eventName='" + getEventName() + "'" +
            ", eventDate='" + getEventDate() + "'" +
            ", eventLocation='" + getEventLocation() + "'" +
            "}";
    }


}