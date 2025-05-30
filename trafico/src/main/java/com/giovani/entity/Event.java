package com.giovani.entity;

public class Event {
    private String type;
    private String description;

    public Event(String type, String description) {
        this.type = type;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Event{" +
                "type='" + type + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
