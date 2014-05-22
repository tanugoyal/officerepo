package schoolManagement;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import schoolManagement.auth.Authenticator;
import schoolManagement.auth.Authenticator.AuthenticationException;
import schoolManagement.auth.FileBasedAuthenticator;
import schoolManagement.auth.Role;
import schoolManagement.ui.AdminMenu;
import schoolManagement.ui.StudentView;

public class Demo 
{
	private final JFrame frame;
	private final Authenticator auth;
	
	public Demo() throws FileNotFoundException, IOException 
	{
		frame = new JFrame("Demo application");
		auth = new FileBasedAuthenticator("src/data/userdb");
	}
	
	public void run()
	{
		setupUI();
	}

	private void setupUI() 
	{
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(10, 10, 80, 25);
		frame.add(userLabel);

		final JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		frame.add(userText);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 40, 80, 25);
		frame.add(passwordLabel);

		final JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 40, 160, 25);
		frame.add(passwordText);

		JButton loginButton = new JButton("login");
		loginButton.setBounds(10, 80, 80, 25);
		frame.add(loginButton);

		JButton registerButton = new JButton("register");
		registerButton.setBounds(180, 80, 80, 25);
		frame.add(registerButton);
		
		final JTextField msgText = new JTextField(20);
		msgText.setBounds(100, 20, 320, 25);
		msgText.setEnabled(false);
		frame.add(msgText);
		
		frame.setVisible(true);
		
		ActionListener loginButtonListener = new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent e) {
				msgText.setText("");
				String uservalue= userText.getText();
				String passvalue= new String(passwordText.getPassword());
				
				try {
					User user = auth.authenticate(uservalue, passvalue);
					if (user.getRole() == Role.ADMIN) {
						AdminMenu ad = new AdminMenu();
						ad.setVisible(true);
					}
					else if (user.getRole() == Role.STUDENT){
						StudentView sv = new StudentView();
						sv.setVisible(true);
					}
				} 
				catch (AuthenticationException ex) {
					msgText.setText(ex.getMessage());
				}
			}

		};
		
		loginButton.addActionListener(loginButtonListener);
		registerButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog((Component) e.getSource(),
					"button has been pressed");
			}
		});
	}

	public static void main(final String[] args) throws FileNotFoundException, IOException 
	{
		Demo d = new Demo();
		d.run();
	}
}