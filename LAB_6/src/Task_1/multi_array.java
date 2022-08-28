/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_1;

import java.util.Scanner;

public class multi_array {
    public static void main(String [] args){
            Scanner in=new Scanner(System.in);

    int matrix1[][] = new int[3][3];
        int[] matrix2[] = new int[3][3];
    int multiply[][] = new int[3][3];
    
        System.out.println("Enter values for first 3 x 3 matrix:\n");
           for (int i = 0 ; i <3 ; i++ )
                {
                   for (int j = 0 ; j <3 ; j++ )
                   {      matrix1 [i][j] =in.nextInt();
                }}
        System.out.println("Enter values for second 3 x 3 matrix:\n");
           for (int i = 0 ; i <3 ; i++ )
                {
                   for (int j = 0 ; j <3 ; j++ ){
                        matrix2[i][j] =in.nextInt();
                }}
                       System.out.println("\n The first 3 x 3 matrix entered by you is:\\n");
           for (int i = 0 ; i <3 ; i++ )
                {
                   for (int j = 0 ; j <3 ; j++ )
                   {System.out.print(matrix1[i][j]+"\t");}
                    System.out.print("\n\n");
                }
                       System.out.println("\n The second 3 x 3 matrix entered by you is:\\n");
           for (int i = 0 ; i <3 ; i++ )
                {
                   for (int j = 0 ; j <3 ; j++ )
                   {System.out.print(matrix2[i][j]+"\t");}
                    System.out.print("\n\n");
                }
           int sum;        
           for (int i = 0 ; i <3; i++ )
                   {
         for (int j = 0 ; j <3 ; j++ )
      
         {
                   sum = 0;
               
                   for (int k = 0 ; k <3 ; k++ )
                   {   
                      sum = sum + matrix1 [i][k] * matrix2[k][j];
                      
                  multiply[i][j] = sum ;
                  
         }}
        }                
        System.out.println("\nThe product of the above two matrices is:\n");
           for (int i = 0 ;i<3 ; i++ )
            {
             for (int j = 0 ; j <3 ; j++ )
             {System.out.print(multiply[i][j]+"\t" );
             
             }
                System.out.print("\n\n");
    } 
}
}
