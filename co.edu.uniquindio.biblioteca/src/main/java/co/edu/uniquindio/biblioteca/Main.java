package co.edu.uniquindio.biblioteca;
import co.edu.uniquindio.biblioteca.model.Book;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    static ArrayList<String> vowelNameBooks = new ArrayList<String>();
    static Book book001 = new Book();
    static Book book002 = new Book();
    static Book book003 = new Book();
    static Book book004 = new Book();
    static Book book005 = new Book();
    public static void main(String[] args) {
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
        getVowelsBooksName();
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
    public static void getVowelsBooksName(){
        vowelNameBooks.add(String.valueOf(book001.getName().toLowerCase().charAt(0)));
        vowelNameBooks.add(String.valueOf(book002.getName().toLowerCase().charAt(0)));
        vowelNameBooks.add(String.valueOf(book003.getName().toLowerCase().charAt(0)));
        vowelNameBooks.add(String.valueOf(book004.getName().toLowerCase().charAt(0)));
        vowelNameBooks.add(String.valueOf(book005.getName().toLowerCase().charAt(0)));
        System.out.println(vowelNameBooks);
        getAmountNamesWithVowels(vowelNameBooks);
    }
    public static Integer getAmountNamesWithVowels(ArrayList<String> vowelNameBooks){
        Integer amount = 0;
        for (var index = 0; index < vowelNameBooks.size(); ++index){
            switch (vowelNameBooks.get(index)) {
                case "a", "e", "i", "o", "u" -> ++amount;
            }
        }
        System.out.println(amount);
        return amount;
    }
}