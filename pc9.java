/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nilima M
 * Write a program that asks the user for the number of miles driven and the gallons of gas
used. It should calculate the car’s MPG and display the result on the screen.
 */
import java.util.Scanner;
public class pc9 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of miles driven : ");
        double miles=input.nextInt();
        System.out.print("enter the gallons of gas used : ");
        double gas= input.nextInt();
        double mpg=miles/gas;
        System.out.println("The MPG is "+ mpg);
    }
    
}
