package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;

/**
 * Created by Chris Bay
 */
@Entity
public class Event {

    @Id
    @GeneratedValue
    private int id;

    private EventType type;

    @NotBlank(message="Name is required")
    @Size(min=3, message="Name must be at least 3 characters long")
    private String name;

    @Size(max=256, message="Description is too long. Please limit to 256 characters")
    private String description;

    @NotBlank(message="Location cannot be left blank.")
    private String location;

    @NotBlank(message="Email is required")
    @Email(message="Invalid Email, try again!")
    private String email;

    @AssertTrue(message="Registration must be required at this time.")
    private boolean registration_required;

    @Positive(message="Number of attendees must be one or more.")
    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    private int numberOfAttendees;

    public Event(String name, String description, String email, EventType type) {
        this.name = name;
        this.description = description;
        this.email=email;
        this.type=type;
    }

    public Event() {}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isRegistration_required() {
        return registration_required;
    }

    public void setRegistration_required(boolean registration_required) {
        this.registration_required = registration_required; }

    public EventType getType() { return type; }

    public void setType(EventType type) { this.type = type; }
}
