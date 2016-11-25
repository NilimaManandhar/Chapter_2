/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapterone;

/**
 *
 * @author Nilima M
 * 12. String Manipulator
Write a program that asks the user to enter the name of his or her favorite city. Use a String
variable to store the input. The program should display the following:
• The number of characters in the city name
• The name of the city in all uppercase letters
• The name of the city in all lowercase letters
• The first character in the name of the city
 */
import java.util.Scanner;
public class pc12 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your favorite City : ");
        String city=input.nextLine();
        System.out.println("The number of characters in the city is "+ city.length());
        System.out.println("The name of the city in upper case : "+ city.toUpperCase());
        System.out.println("The name of the city in lower case : "+ city.toLowerCase());
        System.out.println("The first character in the name of city : "+ city.charAt(0));
    }
    
}
