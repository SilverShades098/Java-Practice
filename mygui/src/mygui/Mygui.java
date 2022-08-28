/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MYJframe extends JFrame{
JFrame f = new JFrame("PRACTICE");
JButton b = new JButton("OK");
JLabel l = new JLabel("THIS IS practice ");

MYJframe(){
    super();
    f.setSize(500,500);
    JPanel p = new JPanel();
    p.add(l);
    p.add(b);
    p.add(f);
    setVisible(true);
    getContentPane().add(p);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
}    
}
public class Mygui {

    public static void main(String[] args) {
        MYJframe g = new MYJframe();
        }
    
}
