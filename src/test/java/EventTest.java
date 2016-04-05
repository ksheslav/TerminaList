import org.junit.Assert;
import org.junit.Test;
import org.terminalist.entities.Event;

import java.util.Date;


public class EventTest {
    @Test
    public void DefaultEventCreationTest() {
        Event event = new Event();
    }

    @Test
    public void EventNameCreationTest() {
        Event event = new Event("EventName");
    }

    @Test
    public void GetDefaultEventNameTestShouldReturnEmptyString() {
        Event event = new Event();
        Assert.assertEquals("", event.getName());
    }

    @Test
    public void GetEventNameTestShouldReturnEventName() {
        Event event = new Event("EventName");
        Assert.assertEquals("EventName", event.getName());
    }

    @Test
    public void SetDefaultEventNameShouldSetEventName() {
        Event event = new Event();
        String eventName = "EventName";
        event.setName(eventName);
        Assert.assertEquals(eventName, event.getName());
    }

    @Test
    public void DefaultEventGetDateShouldReturnDefaultDate() {
        Event event = new Event();
        Date date = new Date();
        Assert.assertEquals(date, event.getDate());
    }

    @Test
    public void DefaultEventSetDateShouldSetDate() {
        Event event = new Event();
        Date date = new Date();
        System.
        event.setDate(new Date());
        Assert.assertEquals(date, event.getDate());
    }
}
