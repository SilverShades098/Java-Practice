/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_5;

import java.util.Scanner;

/**
 *
 * @author zohaib computer
 */
public class task_5 {
 public static void main(String[] abc){ 
     float r;
     Scanner input = new Scanner(System.in);
     System.out.println("Enter area to find Circumference and Area");
     r = input.nextFloat();
    System.out.println("Area of circle is = "+3.14*(r*r));
    System.out.println("Circumference of the circle is = "+2 * 3.14 * r);
     
}
}
