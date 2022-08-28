 public static void main(String [] args)/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TASK_5;

import java.util.Scanner;

/**
 *
 * @author zohaib computer
 */
public class task_5 {
     public static void main(String [] args){
         int i,m=0,flag=0;
         Scanner input = new Scanner(System.in);
        int n=input.nextInt();
         m=n/2;
         if(n==0||n==1)
         {
             System.out.println(n+"IS not prime:");
            
         }
         else{
             for(i=2;i<n/2;i++)
             {
                 if(n%i==0)
                 {
                     System.out.println(n+"IS not prime:");
             flag =1; 
             break;
            
                 }
             
         }
             if(flag==0)
             {
                 System.out.println("Is prime number:");
             }
     }
}
}
