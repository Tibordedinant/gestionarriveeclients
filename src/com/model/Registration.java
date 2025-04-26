package com.model;

import java.util.Objects;

public class Registration {
    private final Client client;
    private final Event event;

    public Registration(Client client, Event event) {
        this.client = client;
        this.event = event;
    }

    public Client getClient() {
        return this.client;
    }

    public Event getEvent() {
        return this.event;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Registration)) {
            return false;
        }
        Registration registration = (Registration) o;
        return Objects.equals(client, registration.client) && Objects.equals(event, registration.event);
    }

    @Override
    public int hashCode() {
        return Objects.hash(client, event);
    }

    @Override
    public String toString() {
        return "{" +
            " client='" + getClient() + "'" +
            ", event='" + getEvent() + "'" +
            "}";
    }
}

