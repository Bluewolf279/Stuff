package com.bluewolf;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matt on 28/07/2015.
 * Class use: This class is used for basic math functions.
 */
public class baseFunctions {
    public static int toDegrees(int i) {
        return (int) (i * (180 / Math.PI));
    }
    public static int toRadians(int i){
        return (int) (i * (Math.PI / 180));
    }
    public void printTofile(String text, boolean lines) {
        Writer writer = null;

        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("filename.txt"), "utf-8"));
            writer.write("Something");
        } catch (IOException ex) {
            // report
        } finally {
            try {writer.close();} catch (Exception ex) {/*ignore*/}
        }
    }
    public static List<String> splitNumber(String text, int i) {
        //part stolen from http://stackoverflow.com/questions/9276639/java-how-to-split-a-string-by-a-number-of-characters
        List<String> strings = new ArrayList<>();
        int index = 0;
        while (index < text.length()) {
            strings.add(text.substring(index, Math.min(index + i,text.length())));
            index += i;
        }
        //
        return strings;
    }

}
