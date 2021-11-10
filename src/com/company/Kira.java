package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Kira {
    public static void main(String[] args){
        boolean check1 = true;
        boolean check2 = true;
        try {
            File file = new File("input1.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String l = scanner.nextLine();
                System.out.println(l);
            }
            scanner.close();
            check2 = false;
        }
        catch (FileNotFoundException ex){
            check1 = false;
            try{
                File file = new File("input2.txt");
                Scanner scanner1 = new Scanner(file);
                while(scanner1.hasNextLine()){
                    String l2 = scanner1.nextLine();
                    System.out.println(l2);
                }
                scanner1.close();
                check2 = true;
            }
            catch (FileNotFoundException s) {
                check2 = false;
            }
        }
        finally {
            if(check1){
                System.out.println("first file was found");
            }else if(check2){
                System.out.println("second file was found");
            }
            else{
                System.out.println("anything.");
            }
        }
    }
}
