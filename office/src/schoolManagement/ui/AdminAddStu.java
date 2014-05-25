package schoolManagement.ui;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import schoolManagement.auth.*;
import schoolManagement.auth.*;


public class AdminAddStu {

	private final JFrame frame4;
	private final GroupLayout layout;
	
	public AdminAddStu() {
		frame4 = new JFrame();
		layout = new GroupLayout(frame4);
	}
	    
	public void run(){
		
		
		setui();
	}
	
	public void setui()   {
	
	//frame4.setSize(700, 650);
	frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame4.setLayout(layout);
	frame4.setVisible(true);
	GroupLayout.SequentialGroup leftToRight = layout.createSequentialGroup();
	GroupLayout.ParallelGroup columnMiddle = layout.createParallelGroup();
	GroupLayout.SequentialGroup topToBottom = layout.createSequentialGroup();
	GroupLayout.ParallelGroup rowTop = layout.createParallelGroup();

   
	JLabel nameLabel = new JLabel("name");
	 leftToRight.addComponent(nameLabel);
	frame4.add(nameLabel);

	final JTextField nameText = new JTextField(20);
	columnMiddle.addComponent(nameText);
	frame4.add(nameText);

	JLabel rollLabel = new JLabel("Roll No");
	leftToRight.addComponent(rollLabel);
	frame4.add(rollLabel);

	final JTextField rollText  = new JTextField(20);
	columnMiddle.addComponent(rollText);
	frame4.add(rollText);
  
	JLabel addressLabel = new JLabel("Address");
	leftToRight.addComponent(addressLabel);
	frame4.add(addressLabel);
	

	final JTextField addressText  = new JTextField(20);
	columnMiddle.addComponent(addressText);
	frame4.add(addressText);
  
	JLabel markLabel = new JLabel("Marks");
	leftToRight.addComponent(markLabel);
	frame4.add(markLabel);

	final JTextField markText  = new JTextField(20);
	columnMiddle.addComponent(markText);
	frame4.add(markText);
  
	JLabel contactLabel = new JLabel("Contact");
	leftToRight.addComponent(contactLabel);
	frame4.add(contactLabel);
	
	final JTextField contactText  = new JTextField(20);
	columnMiddle.addComponent(contactText);
	frame4.add(contactText);
  
	
	
	JButton loginButton = new JButton("login");
	leftToRight.addComponent(loginButton);
	frame4.add(loginButton);

	JButton clearButton = new JButton("Clear");
	columnMiddle.addComponent(clearButton);
	frame4.add(clearButton);
	
	
	rowTop.addComponent(nameLabel);
    rowTop.addComponent(nameText);
    topToBottom.addGroup(rowTop);
    topToBottom.addComponent(rollLabel);
    topToBottom.addComponent(addressLabel);
    topToBottom.addComponent(markLabel);
    topToBottom.addComponent(contactLabel);
    topToBottom.addComponent(loginButton);
    topToBottom.addComponent(rollText);
    topToBottom.addComponent(addressText);
    topToBottom.addComponent(markText);
    topToBottom.addComponent(contactText);
    topToBottom.addComponent(clearButton);
    
    
    layout.setHorizontalGroup(leftToRight);
    layout.setVerticalGroup(topToBottom);

	
	/*final JTextField msgText = new JTextField(20);
	msgText.setBounds(100, 20, 320, 25);
	msgText.setEnabled(false);
	frame4.add(msgText);*/
	
	frame4.setVisible(true);
	
	
	
	}
      

	public static void main(String[] args) {
		AdminAddStu aas = new AdminAddStu();
		aas.run();}
	

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
	
}
