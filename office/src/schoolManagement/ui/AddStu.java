package schoolManagement.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddStu {
	
	
	private final JFrame frame;
	
	 public AddStu(){
		 frame = new JFrame();
		
	}

		public JFrame getFrame() {
		return frame;
	}
	 
		public void run(){
			setUi();
		}
		@SuppressWarnings("unused")
		public void setUi(){
			
			frame.setSize(600, 550);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLayout(null);

			JLabel nameLabel = new JLabel("Name");
		    nameLabel.setBounds(10, 10, 80, 25);
			frame.add(nameLabel);

			final JTextField nameText = new JTextField(20);
			nameText.setBounds(100, 10, 160, 25);
			frame.add(nameText);

			JLabel rollLabel = new JLabel("RollNum");
			rollLabel.setBounds(10, 40, 80, 25);
			frame.add(rollLabel);
			
			final JTextField passwordText = new JTextField(20);
			passwordText.setBounds(100, 40, 160, 25);
			frame.add(passwordText);

			
			
			JButton submitButton= new JButton("Submit");
			submitButton.setBounds(20, 120, 80, 25);
			frame.add(submitButton);
			
			frame.setVisible(true);
			
			
			ActionListener submitButtonListener= new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}
			};
			
			
		}
		
		public static void main(String[] args) {
			
			AddStu as = new AddStu();
			as.run();
			
			
		}
			
			
			
			
			


			
			
			
			
			
			
			
			
		}
	
	

