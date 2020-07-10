package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class EventCategory {

    @Id
    @GeneratedValue
    private int id;

    @Size(min = 3, max = 50, message = "An event category must be between 3 and 50 characters.")
    @NotBlank(message = "This field cannot be blank.")
    @NotNull(message = "This field cannot be null.")
    private String name;

    public EventCategory(String name) {
        this.name = name;
    }

    public EventCategory() {}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
