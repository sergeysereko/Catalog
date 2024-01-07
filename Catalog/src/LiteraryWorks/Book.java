
package LiteraryWorks;
import AbstractClass.LiteraryWork;

class Book extends LiteraryWork {
    private String author;
    private String genre;
    private int pageCount;

    public Book(String title, String author, String genre, int pageCount) {
        super(title);
        this.author = author;
        this.genre = genre;
        this.pageCount = pageCount;
    }

    @Override
    public void displayInfo() {
        System.out.println("Книга: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Жанр: " + genre);
        System.out.println("Количество страниц: " + pageCount);
        System.out.println();
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", pageCount=" + pageCount +
                ", title='" + title + '\'' +
                '}';
    }
}
