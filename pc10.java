/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapterone;

/**
 *
 * @author Nilima M
 * 10. Test Average
Write a program that asks the user to enter three test scores. The program should display
each test score, as well as the average of the scores.
 */
import java.util.Scanner;
public class pc10 {
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter your test score in Math : ");
     int math = input.nextInt();
     System.out.print("Enter your test score in English : ");
     int eng=input.nextInt();
     System.out.print("Enter your test score in Computer: ");
     int comp = input.nextInt();
     int avg= (math+eng+comp)/3;
     System.out.println("The test score of Math is : "+ math);
     System.out.println("The test score of Math is : "+ eng);
     System.out.println("The test score of Math is : "+ comp);
     System.out.println("The average is "+ avg);
    }
    
}
