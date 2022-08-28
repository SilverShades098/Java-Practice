/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2;
import javax.swing.JOptionPane;
/**
 *
 * @author zohaib computer
 */
public class LAB_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input;// TODO code application logic here
        input = JOptionPane.showInputDialog("Please!Enter your name:");
        String inputAge = JOptionPane.showInputDialog("Pleas!Enter your age:");
        int age;
        age = Integer.parseInt(inputAge);
        JOptionPane.showMessageDialog(null,"Name :"+input+"\nAge :"+inputAge);
    }
    
}
