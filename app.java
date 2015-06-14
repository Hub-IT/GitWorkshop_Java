/**
 * The App class implements an application that
 * simply prints "Hello $name!" to standard output,
 * where $name is the name of the user.
 */

import java.io.*;
import java.util.Scanner;

class App {
    public static void main(String[] args) {
    	
    	Scanner in = new Scanner(System.in);
    	String name = "";

    	System.out.println("What is your name?");
    	name = in.nextLine();

        System.out.println("Hello " + name + "!"); // Display the string.
    }
}