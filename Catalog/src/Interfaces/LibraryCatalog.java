package Interfaces;
import AbstractClass.LiteraryWork;
import java.util.List;
import java.io.*;

// Интерфейсный класс для каталога библиотеки
public interface LibraryCatalog {
    void initializeCatalog();

    void displayCatalog();

    List<LiteraryWork> searchByTitle(String title);

    List<LiteraryWork> searchByAuthor(String author);

    void saveCatalog(CatalogSerializer serializer, String filePath) throws IOException;

    void loadCatalog(CatalogSerializer serializer, String filePath) throws IOException, ClassNotFoundException;
}
