package ex01.base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 William Weatherlow
 */
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        App myApp = new App();

        String name = myApp.readName();

        String outputString = myApp.generateOutputString(name);

        myApp.printOutput(outputString);

    }

    private static void printOutput(String outputString) {
        System.out.println(outputString);
    }

    private static String generateOutputString(String name) {
       return "Hello, " + name + ", nice to meet you!";
    }

    private static String readName() {
        System.out.print("What is your name? ");
        return in.nextLine();
    }

}
