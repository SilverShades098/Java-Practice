/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_1;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author zohaib computer
 */
public class LAB_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int data;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter value for module:\n");
       System.out.println("Enter first value :");
       data = input.nextInt();
     System.out.println("Enter second value:");
     int data2 = input.nextInt();
       int exp = data % data2;
       System.out.println("Your Answer is \n");
       System.out.println(exp);
       
       System.out.println("Enter value to find cube");
       Float data3;
      System.out.println("Enetr number :\n");
       data3 = input.nextFloat();
       System.out.println("Your answer is ="+(data3 * data3 *data3));
   
    }
}
