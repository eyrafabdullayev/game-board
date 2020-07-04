package com.example.gameboard.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileUtil {

    public static void writeToFile(String filePath, Object obj) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath));
            outputStream.writeObject(obj);
        } catch (IOException ex) {
            ex.getMessage();
        }
    }

    public static Object readFromFile(String filePath) throws IOException, ClassNotFoundException {
        Object obj = null;
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath));
        obj = inputStream.readObject();
        return obj;
    }
}
