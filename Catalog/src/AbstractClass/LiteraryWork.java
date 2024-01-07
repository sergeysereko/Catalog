package AbstractClass;
import java.io.Serializable;

// Абстрактный класс для литературных произведений
public abstract class LiteraryWork implements Serializable{
    public String title;

    public LiteraryWork(String title) {
        this.title = title;
    }

    // метод для вывода информации о произведении
    public abstract void displayInfo();

    @Override
    public String toString() {
        return "LiteraryWork{" +
                "title='" + title + '\'' +
                '}';
    }
}