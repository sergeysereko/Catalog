package Catalog;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import AbstractClass.LiteraryWork;
import Interfaces.CatalogSerializer;

public class ObjectCatalogSerializer implements CatalogSerializer {
    @Override
    public void serializeCatalog(List<?> catalog, String filePath) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(catalog);
        }
    }

    @Override
    public List<LiteraryWork> deserializeCatalog(String filePath) throws IOException, ClassNotFoundException {
        List<LiteraryWork> catalog = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            List<?> rawList = (List<?>) ois.readObject();
            for (Object obj : rawList) {
                if (obj instanceof LiteraryWork) {
                    catalog.add((LiteraryWork) obj);
                } else {

                    System.err.println("Неверный тип объекта в списке: " + obj.getClass().getName());
                }
            }
        }
        return catalog;
    }
}

