package ru.levklv.library.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class Person {
    private int id;

    @NotEmpty(message = "Full name must be")
    @Pattern(regexp = "^[A-Z][a-z]+ [A-Z][a-z]+ [A-Z][a-z]+$", message = "Your full name need to be in format: Surname Name Patronymic")
    private String fullName;

    @Min(value = 1900, message = "Year of birth should be at least 1900")
    private int yearBorn;

    public Person() {
    }

    public Person(int id, String fullName, int yearBorn) {
        this.id = id;
        this.fullName = fullName;
        this.yearBorn = yearBorn;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
