package com.mycompany.intsplitter;
import java.util.Scanner;
//imported the necessary utilities

/**
 *
 * @author Phillip Plangetis
 * Date/2/1/23
 * Five digit integer splitter
 */
public class Intsplitter {
    //created the class

    public static void main(String[] args) {
        int integer;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a five digit integer here: ");
        //added an output statement for the user
        
        integer = input.nextInt();
        
        //integer gets divided to get split and its result is 
        //outputted on the sceen!
        int output = integer / 10000;
        System.out.println("The first integer is: " + integer / 10000);
        System.out.println("The second integer is: " + integer / 1000%10);
        System.out.println("The third integer is: " + integer / 100%10);
        System.out.println("The fourth integer is: " + integer / 10%10);
        System.out.println("The fifth integer is: " + integer / 1%10);
    }
}