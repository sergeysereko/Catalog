package LiteraryWorks;
import AbstractClass.LiteraryWork;
import java.util.List;


class Newspaper extends LiteraryWork {
    private String releaseDate;
    private List<String> headlines;

    public Newspaper(String title, String releaseDate, List<String> headlines) {
        super(title);
        this.releaseDate = releaseDate;
        this.headlines = headlines;
    }

    @Override
    public void displayInfo() {
        System.out.println("Газета: " + title);
        System.out.println("Дата выхода: " + releaseDate);
        System.out.println("Основные заголовки:");
        for (String headline : headlines) {
            System.out.println("- " + headline);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "releaseDate='" + releaseDate + '\'' +
                ", headlines=" + headlines +
                ", title='" + title + '\'' +
                '}';
    }
}