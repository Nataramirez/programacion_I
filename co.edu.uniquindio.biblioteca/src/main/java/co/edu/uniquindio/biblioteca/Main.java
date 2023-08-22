package co.edu.uniquindio.biblioteca;
import co.edu.uniquindio.biblioteca.model.Book;

public class Main {
    public static void main(String[] args) {
        Book book001 = new Book();
        Book book002 = new Book();
        Book book003 = new Book();
        Book book004 = new Book();
        Book book005 = new Book();

        createBook(book001, "La Piedra Filosofal", "J.K. Rowling", "fantasia",
                1997, 264, "Salamandra");
        createBook(book002, "La Camara Secreta", "J.K. Rowling", "fantasia",
                1998, 357, "Salamandra");
        createBook(book003, "El Prisionero de Azkaban", "J.K. Rowling", "fantasia",
                1999, 326, "Salamandra");
        createBook(book004, "El Caliz de Fuego", "J.K. Rowling", "fantasia",
                2000, 287, "Salamandra");
        createBook(book005, "La Orden del Fenix", "J.K. Rowling", "fantasia",
                2003, 293, "Salamandra");
        System.out.println(book001.getName().toLowerCase().charAt(0));
        System.out.println(book002.getName());
        System.out.println(book003.getName());
        System.out.println(book004.getName());
        System.out.println(book005.getName());
        getAmountNamesWithVowels(book003);
    }
    public static void createBook (Book book, String name, String author, String gender, Integer yearPublish,
                            Integer numberPages, String editorial){
        book.setName(name);
        book.setAuthor(author);
        book.setGender(gender);
        book.setYearPublish(yearPublish);
        book.setNumberPages(numberPages);
        book.setEditorial(editorial);
    }
    public static Integer getAmountNamesWithVowels(Book book001){
        Integer amount = 0;
        String book1 = String.valueOf(book001.getName().toLowerCase().charAt(0));
        System.out.println(book1);
        switch (book1) {
            case "a", "e", "i", "o", "u" -> ++amount;
        }
        System.out.println(amount);
        return amount;
    }
}