
import java.awt.Color;
import javafx.scene.control.ComboBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;


class pJFrame extends JFrame{
JButton b1;
JPanel p1;
JLabel j1;

JMenuBar m1;

pJFrame(){
    super();
    setSize(500,500);
    setTitle("Jamshad");
   JMenuBar m1 = new JMenuBar();
   m1 = new JMenuBar("File");
setVisible(true);
p1 =new JPanel();
p1.add(m1);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
getContentPane().add(p1);

}
}


public class Task_2 {
     public static void main(String [] args){   
  pJFrame f1 = new pJFrame();
}
}
