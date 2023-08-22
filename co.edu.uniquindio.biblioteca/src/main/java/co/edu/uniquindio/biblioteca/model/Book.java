package co.edu.uniquindio.biblioteca.model;

public class Book {
    private String name;
    private String author;
    private String gender;
    private Integer yearPublish;
    private Integer numberPages;
    private String editorial;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getYearPublish() {
        return yearPublish;
    }

    public void setYearPublish(Integer yearPublish) {
        this.yearPublish = yearPublish;
    }

    public Integer getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(Integer numberPages) {
        this.numberPages = numberPages;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
