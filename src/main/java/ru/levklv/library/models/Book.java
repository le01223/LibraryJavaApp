package ru.levklv.library.models;

import jakarta.validation.constraints.*;

public class Book {
    private int id;

    @NotEmpty(message = "The title must not be empty")
    @Size(min = 2, message = "The title must contain at least 2 characters")
    private String title;

    @Pattern(regexp = "^[A-Z][a-z]+ [A-Z][a-z]+$", message = "Author name must be in the format: Firstname Lastname (in Cyrillic)")
    @NotEmpty(message = "Author name must not be empty")
    private String authorName;

    @Min(value = 1000, message = "The year of writing cannot be earlier than 1000")
    @Max(value = 2025, message = "The year of writing cannot exceed 2025")
    private int yearOfWriting;


    public Book() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book(String title, String authorName, int yearOfWriting) {
        this.title = title;
        this.authorName = authorName;
        this.yearOfWriting = yearOfWriting;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getYearOfWriting() {
        return yearOfWriting;
    }

    public void setYearOfWriting(int yearOfWriting) {
        this.yearOfWriting = yearOfWriting;
    }
}
