package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("hw.txt");

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String l = scanner.nextLine();
                System.out.println(l);
            }

            scanner.close();
        } catch (FileNotFoundException n) {
            System.out.println("not found file");

        }

    }
}
