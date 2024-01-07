package Interfaces;
import AbstractClass.LiteraryWork;
import java.util.List;

// Интерфейсный класс для каталога библиотеки
public interface LibraryCatalog {
    void initializeCatalog();

    void displayCatalog();

    List<LiteraryWork> searchByTitle(String title);

    List<LiteraryWork> searchByAuthor(String author);
}
