package Interfaces;
import java.util.List;
import java.io.*;
import AbstractClass.LiteraryWork;

public interface CatalogSerializer {
    void serializeCatalog(List<LiteraryWork> catalog, String filePath) throws IOException;

    List<LiteraryWork> deserializeCatalog(String filePath) throws IOException, ClassNotFoundException;
}