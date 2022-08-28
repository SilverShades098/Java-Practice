/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;
import java.util.Scanner;
/**
 *
 * @author zohaib computer
 */
public class TASK_2 {
    public static void main(String[] args){
        int data;
        Scanner input = new Scanner(System.in);
       System.out.println("Enter 1st value \n");
       data = input.nextInt();
       System.out.println("Enter second value \n");
       int data2 = input.nextInt();
       int exp = 100;
       System.out.println("Average =");
       System.out.println(data + data2 / exp);
      System.out.println("Sum of values");
      System.out.println(data + data2);
      System.out.println("Difference in values");
      System.out.println(data - data2);
    }
    
}
