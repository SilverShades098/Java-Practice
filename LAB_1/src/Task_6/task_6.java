/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_6;

import java.util.Scanner;

/**
 *
 * @author zohaib computer
 */
public class task_6 {
    public static void main(String[] abc)
    {
        float distance;
        float speed = 60;
        Scanner input = new Scanner(System.in);
        System.out.println("time to reach destination:");
         distance = input.nextFloat();
        System.out.println(distance/speed);
        
        
    }
    
}
