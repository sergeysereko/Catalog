package LiteraryWorks;
import AbstractClass.LiteraryWork;
import java.util.List;
import java.io.Serializable;

// Класс для альманаха
public class Anthology extends LiteraryWork implements Serializable {
    private List<Book> works;

    public Anthology(String title, List<Book> works) {
        super(title);
        this.works = works;
    }

    @Override
    public void displayInfo() {
        System.out.println("Альманах: " + title);
        System.out.println("Произведения:");
        for (Book work : works) {
            work.displayInfo();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Anthology{" +
                "works=" + works +
                ", title='" + title + '\'' +
                '}';
    }
}