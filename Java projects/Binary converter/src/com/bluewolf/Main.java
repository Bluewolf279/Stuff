package com.bluewolf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Run");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String accStr;
        System.out.println("Enter your Account number: ");
        accStr = br.readLine();
        System.out.println(accStr);
        baseFunctions.printFile(Binary_encoder.bEncoder(accStr),"text",1000);
    }
}
