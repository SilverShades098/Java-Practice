/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_4;

/**
 *
 * @author zohaib computer
 */
public class EmployTest {
    public static void main(String[] args)
    {
        employ e1 = new employ();
        System.out.println("id of emp :"+e1.set_id()+"\nFirst name :"+e1.set_Firstname()+"\nLast name :"+e1.set_Lastname());
        System.out.println("salary:"+e1.salary()+"\nAnnual salary is :"+e1.Annual_salary()+"Salary after bonus :"+e1.Increse_salary(4));
    }
    
}
