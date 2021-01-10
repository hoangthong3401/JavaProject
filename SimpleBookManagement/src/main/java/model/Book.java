package model;

import java.util.UUID;

/**
 *
 * @author jingtian
 */
public class Book {

    private UUID id;
    private String title;
    private String author;
    private String language;
    private String publisher;
    private int pages;
    private Category category;

    public Book(String title, String author, String language, String publisher, int pages, Category category) {
        this.title = title;
        this.author = author;
        this.language = language;
        this.publisher = publisher;
        this.pages = pages;
        this.category = category;
        this.id = UUID.randomUUID();
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public UUID getId() {
        return id;
    }

}
