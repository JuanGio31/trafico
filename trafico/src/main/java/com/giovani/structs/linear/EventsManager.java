package com.giovani.structs.linear;

import com.giovani.entity.Event;

import java.util.Stack;

public class EventsManager {
    private final Stack<Event> events;

    public EventsManager() {
        this.events = new Stack<>();
    }

    public void addEvent(Event event) {
        this.events.push(event);
    }

    public void printRecentEvents() {
        Stack<Event> temp = new Stack<>();
        temp.addAll(events);
        int n = Math.min(8, temp.size());
        for (int i = 0; i < n; i++) {
            System.out.println(temp.pop());
        }
        System.out.println(" ");
    }

    public void printEvents() {
        int n = Math.min(20, events.size());
        for (int i = 0; i < n; i++) {
            System.out.println(events.pop());
        }
    }
}
