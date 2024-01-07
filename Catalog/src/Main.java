import Catalog.Catalog;
import Interfaces.CatalogSerializer;
import Catalog.ObjectCatalogSerializer;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.initializeCatalog();

        // Сохранение каталога в файл
        CatalogSerializer serializer = new ObjectCatalogSerializer();
        String filePath = "library_catalog.ser";
        try {
            catalog.saveCatalog(serializer, filePath);
            System.out.println("Каталог сохранен в файл: " + filePath);
        } catch (IOException e) {
            System.err.println("Ошибка при сохранении каталога: " + e.getMessage());
        }

        // Загрузка каталога из файла
        try {
            catalog.loadCatalog(serializer, filePath);
            System.out.println("Каталог загружен из файла: " + filePath);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Ошибка при загрузке каталога: " + e.getMessage());
        }

        // Отображение каталога после загрузки
        System.out.println("Каталог библиотеки после загрузки:");
        catalog.displayCatalog();
    }
}