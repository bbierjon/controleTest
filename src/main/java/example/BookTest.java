package example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
    // Méthode de source de données pour les tests paramétrés
    static Stream<Book> bookProvider() {
        return Stream.of(
                new Book("Book 1", "Author 1", "2022-01-01"),
                new Book("Book 2", "Author 2", "2022-02-02"),
                new Book("Book 3", "Author 3", "2022-03-03")
        );
    }

    @ParameterizedTest
    @MethodSource("bookProvider")
    void getTitle(Book book) {
        String expectedTitle = book.getTitle();
        assertEquals(expectedTitle, book.getTitle());
    }

    @ParameterizedTest
    @MethodSource("bookProvider")
    void getAuthor(Book book) {
        String expectedAuthor = book.getAuthor();
        assertEquals(expectedAuthor, book.getAuthor());
    }

    @ParameterizedTest
    @MethodSource("bookProvider")
    void getPublicationDate(Book book) {
        String expectedPublicationDate = book.getPublicationDate();
        assertEquals(expectedPublicationDate, book.getPublicationDate());
    }

    @Test
    void setTitle() {
        String expectedTitle = "New Title";
        Book book = new Book("Old Title", "Author", "2022-01-01");
        book.setTitle(expectedTitle);
        assertEquals(expectedTitle, book.getTitle());
    }

    @Test
    void setAuthor() {
        String expectedAuthor = "New Author";
        Book book = new Book("Title", "Old Author", "2022-01-01");
        book.setAuthor(expectedAuthor);
        assertEquals(expectedAuthor, book.getAuthor());
    }

    @Test
    void setPublicationDate() {
        String expectedPublicationDate = "2022-12-31";
        Book book = new Book("Title", "Author", "2022-01-01");
        book.setPublicationDate(expectedPublicationDate);
        assertEquals(expectedPublicationDate, book.getPublicationDate());
    }
}