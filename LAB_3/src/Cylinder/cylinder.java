/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cylinder;

/**
 *
 * @author zohaib computer
 */
public class cylinder {
    private double radius;
    private double height;
    cylinder()
    {
        radius=2;
        height=6;
    }
   
    public void set_radius(double ra)
    {
        this.radius=ra;
    }
    public void set_height(double h)
    {
        this.height=h;
    }
    public double get_radius()
    {
        return radius;
    }
    public double get_height()
    {
        return height;
    }
    
}
