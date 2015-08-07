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

    public void printFile(String text, String fileName,int charPerline) {
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(fileName+ ".txt"), "utf-8"))) {
            if (text.length() > charPerline) {

                List<String> subtext = new ArrayList<String>();
                int index = 0;
                while (index < text.length()) {
                    subtext.add(text.s  ubstring(index, Math.min(index + charPerline,text.length())));
                    index += charPerline;
                }
                writer.write(subtext.get(0));
                for (int i = 1;text.length()>144*i;i++) {
                    writer.write("\n"+subtext.get(i));
                }
            }
            else {
                writer.write(text);
            }
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        }