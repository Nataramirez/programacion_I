package co.edu.uniquindio.biblioteca;
import co.edu.uniquindio.biblioteca.model.Book;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Book book001 = createBook("La Piedra Filosofal", "J.K. Rowling", "fantasia",
                1997, 264, "Salamandra");
        Book book002 = createBook("La Camara Secreta", "J.K. Rowling", "fantasia",
                1998, 357, "Salamandra");
        Book book003 = createBook("El Prisionero de Azkaban", "J.K. Rowling", "fantasia",
                1999, 326, "Salamandra");
        Book book004 = createBook("El Caliz de Fuego", "J.K. Rowling", "fantasia",
                2000, 287, "Salamandra");
        Book book005 = createBook("La Orden del Fenix", "J.K. Rowling", "fantasia",
                2003, 293, "Salamandra");

        getVowelsBooksName(book001, book002, book003, book004, book005);
        changeBookName();
        getTypeGender("terror", book001, book002, book003, book004, book005);
    }

    public static Book createBook(String name, String author, String gender, Integer yearPublish,
                                  Integer numberPages, String editorial) {
        Book book = new Book();
        book.setName(name);
        book.setAuthor(author);
        book.setGender(gender);
        book.setYearPublish(yearPublish);
        book.setNumberPages(numberPages);
        book.setEditorial(editorial);
        return book;
    }

    public static void getVowelsBooksName(Book book001, Book book002, Book book003, Book book004, Book book005) {
        ArrayList<String> vowelNameBooks = new ArrayList<>();
        vowelNameBooks.add(String.valueOf(book001.getName().toLowerCase().charAt(0)));
        vowelNameBooks.add(String.valueOf(book002.getName().toLowerCase().charAt(0)));
        vowelNameBooks.add(String.valueOf(book003.getName().toLowerCase().charAt(0)));
        vowelNameBooks.add(String.valueOf(book004.getName().toLowerCase().charAt(0)));
        vowelNameBooks.add(String.valueOf(book005.getName().toLowerCase().charAt(0)));
        System.out.println(vowelNameBooks);
        getAmountNamesWithVowels(vowelNameBooks);
    }

    public static void getAmountNamesWithVowels(ArrayList<String> vowelNameBooks) {
        int vowelsAmount = 0;
        int consonantsAmount = 0;
        for (String vowelNameBook : vowelNameBooks) {
            switch (vowelNameBook) {
                case "a", "e", "i", "o", "u" -> ++vowelsAmount;
                default -> ++consonantsAmount;
            }
        }
        System.out.println("La cantidad de consonantes es: " + consonantsAmount);
        System.out.println("La cantidad de vocales es: " + vowelsAmount);
    }

    public static void changeBookName(){
        String validName = "Cálculo integral y diferencial";
        String inValidName = "Cálculo integral";
        Book calculationBook = createBook("Cálculo Integral", "Jose Manuel Bayod", "Calculation",
                2012, 235, "No aplica");
        if(calculationBook.getName().equalsIgnoreCase(inValidName)){
            calculationBook.setName(validName);
            System.out.println("El nombre del libro fue cambiado a: " + calculationBook.getName());
        }else {
            System.out.println("El nombre del libro es correcto: " + calculationBook.getName());
        }
    }

    public static void getTypeGender(String typeGender, Book book001, Book book002, Book book003, Book book004,
                                     Book book005){
        int amountTypeGender = 0;
        if(book001.getGender().equalsIgnoreCase(typeGender)){
            ++amountTypeGender;
        }
        if (book002.getGender().equalsIgnoreCase(typeGender)) {
            ++amountTypeGender;
        }
        if (book003.getGender().equalsIgnoreCase(typeGender)) {
            ++amountTypeGender;
        }
        if (book004.getGender().equalsIgnoreCase(typeGender)) {
            ++amountTypeGender;
        }
        if (book005.getGender().equalsIgnoreCase(typeGender)) {
            ++amountTypeGender;
        }

        if(amountTypeGender > 1){
            System.out.println("Existen " + amountTypeGender + " libros del tipo de genero " + typeGender.toUpperCase());
        } else if (amountTypeGender == 1) {
            System.out.println("Existe " + amountTypeGender + " libro del tipo de genero " + typeGender.toUpperCase());
        } else {
            System.out.println("No existen libros del typo de genero " + typeGender.toUpperCase());
        }
    }
}