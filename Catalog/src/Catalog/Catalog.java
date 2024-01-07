package Catalog;
import AbstractClass.LiteraryWork;
import Interfaces.LibraryCatalog;
import LiteraryWorks.*;
import java.util.ArrayList;
import java.util.List;



// Реализация интерфейсного класса
public class Catalog implements LibraryCatalog {

        private List<LiteraryWork> catalog;

        public Catalog() {
            this.catalog = new ArrayList<>();
        }

        @Override
        public void initializeCatalog() {
            // Тестовая инициализация каталога
            List<String> headlines = new ArrayList<>();
            headlines.add("Заголовок 1");
            headlines.add("Заголовок 2");

            Book book1 = new Book("Книга 1", "Автор 1", "Жанр 1", 200);
            Book book2 = new Book("Книга 2", "Автор 2", "Жанр 2", 150);

            Newspaper newspaper = new Newspaper("Газета 1", "01.01.2024", headlines);

            List<Book> anthologyWorks = new ArrayList<>();
            anthologyWorks.add(new Book("Произведение 1", "Автор 3", "Жанр 3", 180));
            anthologyWorks.add(new Book("Произведение 2", "Автор 4", "Жанр 4", 220));

            Anthology anthology = new Anthology("Альманах 1", anthologyWorks);

            catalog.add(book1);
            catalog.add(book2);
            catalog.add(newspaper);
            catalog.add(anthology);
        }

        @Override
        public void displayCatalog() {
            for (LiteraryWork work : catalog) {
                work.displayInfo();
            }
        }

        @Override
        public List<LiteraryWork> searchByTitle(String title) {
            List<LiteraryWork> results = new ArrayList<>();
            for (LiteraryWork work : catalog) {
                if (work.title.equalsIgnoreCase(title)) {
                    results.add(work);
                }
            }
            return results;
        }

        @Override
        public List<LiteraryWork> searchByAuthor(String author) {
            List<LiteraryWork> results = new ArrayList<>();
            for (LiteraryWork work : catalog) {
                if (work instanceof Book) {
                    Book book = (Book) work;
                    if (book.getAuthor().equalsIgnoreCase(author)) {
                        results.add(work);
                    }
                }
            }
            return results;
        }
}


