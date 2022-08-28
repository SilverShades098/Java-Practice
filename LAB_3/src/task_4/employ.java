/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_4;

import java.util.Scanner;

/**
 *
 * @author zohaib computer
 */
public class employ {
private int id;
private String Firstname;
private String Lastname;
private int salary;
employ()
{
    id=2;
    Firstname="Muhammad";
    Lastname="Mubeen";
    salary=4500;
}
public void set_id(int id)
{
    this.id=id;
}
public void set_Firstname(String first)
{
    this.Firstname=first;
}
public void set_Lastname(String second)
{
    this.Lastname=second;
}
public void set_salary(int sal)
{
    this.salary=sal;
}
public int set_id()
{
    return id;
}
public String set_Firstname()
{
    return Firstname;
}
public String set_Lastname()
{
    return Lastname;
}
public int salary()
{
    return salary;
}
public double Annual_salary()
{
    int sala= salary*12;
    System.out.println(sala);
    return (0);
}
public double Increse_salary(double bonus)
{
    return salary+=(bonus/100)*salary;
}
}
