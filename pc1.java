# Chapter_2 Problem1
/*
1. Name, Age, and Annual Income
Write a program that declares the following:
a String variable named name
an int variable named age
a double variable named annualPay
Store your age, name, and desired annual income as literals in these variables. The program
should display these values on the screen in a manner similar to the following:
My name is Joe Mahoney, my age is 26 and
I hope to earn $100000.0 per year.


*/
/**
 *
 * @author Nilima M
 */
import java.util.Scanner;
public class pc1 {
    public static void main(String[] args)
    {
        String name;
        int age;
        double annualPay;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your name : ");
        name=input.nextLine();
        System.out.print("Enter your age : ");
        age=input.nextInt();
        System.out.print("Enter your annual pay : ");
        annualPay=input.nextDouble();
        System.out.println("My name is "+ name  +", my age is "+
                age + "I hope to earn $"+ annualPay+ " per year." );
    }
    
}
