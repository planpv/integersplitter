package com.mycompany.intproj;

/**
 *
 * @author pplan
 * Date: 1/30/23
 * Integer Separator Program
 */

import java.util.Scanner;
//imported Scanner class to get user input from keyboard

public class Intproj {
//created the class
    public static void main(String[] args) {
        Scanner integerInput = new Scanner(System.in);
        System.out.printf("Enter a five digit integer: \n");
        String intOutput = integerInput.nextLine();
        System.out.printf(intOutput);
    }
}
