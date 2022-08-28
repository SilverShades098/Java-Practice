import java.awt.Choice;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

class JJframe extends JFrame
{
  JButton addrecord;
  JLabel labelname;
  JTextField textfield;
  JScrollPane spane;
  JList months;
  JCheckBox cpp,java;
  JRadioButton male,female;
  Choice weeks;
  JTable table;
  
  String month[]={"January","Febuary","March","April","May","June", "July",
  "August","September","October","November","December"};

  JJframe()
  {
	this.setSize(700,700);
	  
	addrecord=new JButton();
	addrecord.setText("Click");
	spane=new JScrollPane();
	months=new JList(month);
	spane=new JScrollPane(months);
	labelname=new JLabel("Name:");
	textfield=new JTextField(15);
	java=new JCheckBox("Java");
	cpp=new JCheckBox("C++");
	male=new JRadioButton("Male");    
	female=new JRadioButton("Female");
	weeks=new Choice();
    weeks.addItem("Monday");
    weeks.addItem("Tuesday");
    weeks.addItem("Wednesday");
    weeks.add("Thursday");
    weeks.add("Friday");
    weeks.add("Saturday");
    weeks.add("Sunday");

    String header[]= {"Name","Gender","Course"};

   table = new JTable(0,3);
	DefaultTableModel model=(DefaultTableModel)table.getModel();	
	model.addRow(header);
    
    addrecord.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
    		
    		String check = null,radio=null;
    		if(java.isSelected()) {check=java.getText();}
    		if(cpp.isSelected()) {check=cpp.getText();}
    		if(male.isSelected()) {radio=male.getText();}
    		if(female.isSelected()) {radio=female.getText();}
    		
    		String data[]= {textfield.getText(),check,radio};
    		model.addRow(data);
    	}   	
   });
    
    
	JPanel jp=new JPanel();
	jp.add(addrecord);
	jp.add(spane);
	jp.add(labelname);
	jp.add(textfield);
	jp.add(weeks);
	jp.add(java);
	jp.add(cpp);
	jp.add(male);
	jp.add(female);
	jp.add(table);
	setVisible(true);
	this.getContentPane().add(jp);
	
  }
}

public class Task4 {

	public static void main(String[] args) {
		
		JJframe jjf=new JJframe();
	}

}
