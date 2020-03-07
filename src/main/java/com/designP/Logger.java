package com.designP;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private FileWriter fileWriter;

    public Logger() throws IOException {
        File file = new File("/Users/lijun/Desktop/log/log.txt");
        fileWriter = new FileWriter(file,true);
    }

    public void log(String message) throws IOException {
        fileWriter.write(message);
    }
}