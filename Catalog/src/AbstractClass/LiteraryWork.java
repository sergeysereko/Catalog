package AbstractClass;

// Абстрактный класс для литературных произведений
abstract class LiteraryWork {
    protected String title;

    public LiteraryWork(String title) {
        this.title = title;
    }

    // метод для вывода информации о произведении
    public abstract void displayInfo();
}