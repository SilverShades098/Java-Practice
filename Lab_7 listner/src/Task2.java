import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

class MJframe extends JFrame
{
  JMenuBar m;
  JMenu jm[];
  JMenuItem jmi[];
  String menuitems[]= {"New File","Save","Undo","Cut","Red","Green","Blue"};
    JPanel p = new JPanel();
  
  MJframe()
  {
    this.setSize(400,200);
    
    jmi=new JMenuItem[7];
    for(int a=0;a<menuitems.length;a++)
    {
      jmi[a]=new JMenuItem(menuitems[a]);	
    }
    
    jm=new JMenu[4];
    jm[0]=new JMenu("File");
    jm[1]=new JMenu("Edit");
    jm[2]=new JMenu("Select Color");
    jm[3]=new JMenu("Clicked Coordinates");
    
    jm[0].add(jmi[0]);
    jm[0].add(jmi[1]);
    jm[1].add(jmi[2]);
    jm[1].add(jmi[3]);
    jm[2].add(jmi[4]);
    jm[2].add(jmi[5]);
    jm[2].add(jmi[6]);
    
    m=new JMenuBar();
    
    m.add(jm[0]);
    m.add(jm[1]);
    m.add(jm[2]);
    m.add(jm[3]);
    
    jmi[4].addActionListener(this);
    jmi[5].addActionListener(this);
    jmi[6].addActionListener(this);
    p.add(m);
    
    this.setVisible(true);

    getContentPane().add(p);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);

  }
public void actionPerformed(ActionEvent ae) {  
                        if(ae.getSource().equals("Red"))
          {
                        p.setBackground(Color.red);  
            }
    	        }  
  
}


public class Task2 {

	public static void main(String[] args) {

		MJframe jf = new MJframe();

	}

}
