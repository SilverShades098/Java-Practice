package TASK_2;
import javax.swing.JOptionPane;
/**
 *
 * @author shani
 */
public class task_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num1;
        float num2;
        String operator;
        String inputOperator=JOptionPane.showInputDialog("Please!enter operator:");
        String inputNumber1=JOptionPane.showInputDialog("please!enter value 1 :");
          String inputNumber2=JOptionPane.showInputDialog("please!enter value num2 :");
          float a=Integer.parseInt(inputNumber1);
        float b=Integer.parseInt(inputNumber2);
        char op=inputOperator.charAt(0);
        JOptionPane.showMessageDialog(null,"operation: "+inputOperator+","+"num1: "+inputNumber1+","+"num2: "+inputNumber2);
        switch(op){
        
            case '+':
            {
                JOptionPane.showMessageDialog(null,"Addition of two value is"+ a+b);
                break;
            }
            case'-':
                {
                    JOptionPane.showMessageDialog(null,"Subtraction of two value is"+ (a-b));
                break;
                }
            case'/':
            {
               JOptionPane.showMessageDialog(null,"Division of two value is"+a/b);
                break;
             }
            case'*':
            {
                JOptionPane.showMessageDialog(null,"Multiplication of two value is"+ a*b);
                 break;
            }
            case'%':
            {
                JOptionPane.showMessageDialog(null,"Module of two value is"+ a%b);
                break;
            }
                        
            default:
        {  JOptionPane.showMessageDialog(null,"Error!!!");
        }
        }
    }
}