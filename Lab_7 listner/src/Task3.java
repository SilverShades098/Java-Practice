import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class NJframe extends JFrame
{
  JLabel l1,l2;
  JTextField jt1,jt2;
  JButton button;
  
  NJframe()
  {
    this.setSize(400,200);
    this.setTitle("Login");
    
    l1=new JLabel("User Name");
    l2=new JLabel("Password");
    jt1=new JTextField(10);
    jt2=new JTextField(10);
    button=new JButton("OK");
    button.setAlignmentX(RIGHT_ALIGNMENT);;
    
    JPanel p = new JPanel();

    p.add(l1);
    p.add(jt1);
    p.add(l2);
    p.add(jt2);
    p.add(button);
    
    this.setVisible(true);

    getContentPane().add(p);

  }
  
}

public class Task3 {

	public static void main(String[] args) {

		NJframe jf = new NJframe();

	}

}
