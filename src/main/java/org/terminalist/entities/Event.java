package org.terminalist.entities;

import java.util.Date;

public class Event {
    private String eventName = "";
    private Date date;

    public Event(String eventName) {
        this.eventName = eventName;
    }

    public Event() {
    }

    public String getName() {
        return eventName;
    }

    public void setName(String name) {
        this.eventName = name;
    }

    public Date getDate() {
        return new Date();
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
