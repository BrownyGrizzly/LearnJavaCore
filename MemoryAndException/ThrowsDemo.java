package MemoryAndException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            readFile("file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        // Read file...
    }
}

