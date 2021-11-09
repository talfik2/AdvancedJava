package javadevelopmentday04;

import java.util.Scanner;

public class DataStreams {
    public  static void main(String[] args) {
        // System.in
        Scanner scan = new Scanner(System.in); // is used to get data from the user
        System.out.println("Enter your name");
        String name = scan.nextLine();

        System.out.println(name); // name in black
        //System.err.println(name); // name in red

        try {
            System.out.println(12 / 0);
        } catch(ArithmeticException e) {
            System.out.println("You are in the catch block");
            System.err.println("You tried to divide number by zero");
        }
    }
}
