
import java.awt.Color;
import javafx.scene.control.ComboBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyJFrame extends JFrame{
JButton b1;
JPanel p1;
JLabel j1;
ComboBox c1;
private String dis[]= {"Black","Red","Brown","Orange","Yellow","Green"};
MyJFrame(){
    super();
    setSize(500,500);
    setTitle("Jamshad");
    JComboBox c1=new JComboBox(dis);
    /*c1.addItem("Black");
   c1.addItem("Red");
   c1.addItem("Yellow");
   c1.addItem("Orange");*/
JLabel j1= new JLabel("Choose Color");
j1.setBackground((Color.yellow));
    b1 = new JButton("Reset");
    
c1.setName("jhgjgj");
setVisible(true);
p1 =new JPanel();
p1.add(b1);
p1.add(j1);
p1.add(c1);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
getContentPane().add(p1);

}
}

public class tasK_1 {
 public static void main(String [] args){   
  MyJFrame f1 = new MyJFrame();

  
}}
