/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc1_1;

/**
 *Problem one using GUI
 * @author Nilima M
 */
import javax.swing.JOptionPane;
public class java {
    public static void main(String[] args)
    {
        //As per requirements variables
        String name;
        int age;
        double annualPay;
        name = JOptionPane.showInputDialog("Enter your name : ");
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age : "));
        annualPay = Double.parseDouble(JOptionPane.showInputDialog("Enter your annual pay : "));
        
        //Show result
        JOptionPane.showMessageDialog(null, "My name is "+ name + 
                ", my age is  "+ age + 
                "and I hope to earn $"+ annualPay+ "per year.");
        
        //Exit
        System.exit(0);
        
        
    }
}
