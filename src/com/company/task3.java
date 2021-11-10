package com.company;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class task3 {
    public static void main(String[] args){
        try{
            File file = new File("inpuut.txt");
            Scanner scanner = new Scanner(file);
            int cnt_L = 0, cnt_w = 0;
            PrintWriter writer = new PrintWriter("output.txt");
            while(scanner.hasNextLine()){
                cnt_L++;
                String[] l = scanner.nextLine().split(" ");
                cnt_w = cnt_w + l.length;
            }

            writer.write("Number of lines: " + cnt_L + "\nNumber of word: " + cnt_w);
            scanner.close();
            writer.close();
        } catch(FileNotFoundException ex) {
            System.out.println("File not found.");
        }
    }

        }


