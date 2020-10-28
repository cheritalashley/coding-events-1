package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.*;

@Entity
public class EventDetails extends AbstractEntity {
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
    private int numberOfAttendees;

    public EventDetails(String description, String location, String email, boolean registration_required, int numberOfAttendees) {
        this.description = description;
        this.location = location;
        this.email = email;
        this.registration_required = registration_required;
        this.numberOfAttendees = numberOfAttendees;
    }

    public EventDetails() {
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
        this.registration_required = registration_required;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }
}
