package com.mycompany.app;

// Import ArrayList class inside of the java.util package
import java.util.ArrayList;

// Import all classes inside of java.security package
import java.security.*;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
        // // String Concatenation:
        // System.out.println(
        //     "Integer: " + 10 +  // integer
        //     " Double: " + 3.14 + // decimal or float
        //     " Boolean: " + true // tre or false
        // );

        System.out.print("Hello ");
        System.out.print("World\n");
        System.out.println("World");
        // new line -> \n
        // this.println("World");

        System.out.println(Math.PI);
        System.out.printf("pi2 = %.3f\n", Math.PI);

        Scanner scanner = new Scanner(System.in);
    }
}
