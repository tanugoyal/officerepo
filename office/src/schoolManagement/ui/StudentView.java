package schoolManagement.ui;

import javax.swing.JFrame;

public class StudentView {

	private final JFrame frame3;

	public StudentView() {

		frame3 = new JFrame();
	}

	public void run() {
		setui();
	}

	public void setui() {
		frame3.setSize(300, 150);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.setLayout(null);
	}

	public static void main(String[] args) {
		StudentView sv = new StudentView();
		sv.run();
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub

	}

}
