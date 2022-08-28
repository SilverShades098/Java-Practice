import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyJframe extends JFrame
{
  JLabel l = new JLabel("Choose Color");
  JComboBox c = new JComboBox();
  JButton b = new JButton("Ok");
  JButton r = new JButton("Reset");  
  MyJframe()
  {
    this.setSize(300,200);
    c.addItem("Black");
    c.addItem("Yellow");
    c.addItem("Pink");
    c.addItem("Gray");
    c.addItem("Orange");
    c.addItem("Red");
JPanel p = new JPanel();
    

    r.addActionListener(new ActionListener(){  
            @Override
    	public void actionPerformed(ActionEvent e){  
                        c.setSelectedIndex(0);
                      p.setBackground(Color.white);  
    	        }  
    	    });

    b.addActionListener(new ActionListener(){  
            @Override
    	public void actionPerformed(ActionEvent e){  
    	          
                  
                       if(c.getSelectedItem().equals("Black"))
          {
                        p.setBackground(Color.gray);  
            }
        if(c.getSelectedItem().equals("Yellow"))
          {
                        p.setBackground(Color.yellow);  
            }
                                   if(c.getSelectedItem().equals("Pink"))
          {
                        p.setBackground(Color.pink);  
            }
        if(c.getSelectedItem().equals("Gray"))
          {
                        p.setBackground(Color.GRAY);  
            }
                               if(c.getSelectedItem().equals("Orange"))
          {
                        p.setBackground(Color.orange);  
            }
        if(c.getSelectedItem().equals("Red"))
          {
                        p.setBackground(Color.RED);  
            }  
    	        }  
    	    });
    
    
    p.add(l);
    p.add(c);
    p.add(b);
    p.add(r);
    this.setVisible(true);

    getContentPane().add(p);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);

  }
  
}

public class Task1 {

	public static void main(String[] args) {

		MyJframe j = new MyJframe();

	}

}
