package schoolManagement.ui;

import javax.swing.JFrame;

public class AdminUI {
	
	
	private final JFrame frame1;
	public AdminUI() {
		frame1 = new JFrame("Demo application");
	}
	
	private void setupUI() 
	{
		frame1.setSize(300, 150);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setLayout(null);
		frame1.setVisible(true);
	}

	public static void main(final String[] args)
	{
		AdminUI ad = new AdminUI();
		ad.setupUI();
	}

	public void setVisible(boolean b) {
		
		// TODO Auto-generated method stub
		
	} 
}
