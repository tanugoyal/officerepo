package schoolManagement.ui;

import javax.swing.*;

public class AdminMenu {
	public static void main(String[] args) {
		AdminMenu s = new AdminMenu();
	}

	public AdminMenu() {
		JFrame frame = new JFrame("Welcome to Admin Page");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar menubar = new JMenuBar();
		JMenu filemenu = new JMenu("File");
		filemenu.add(new JSeparator());
		JMenu editmenu = new JMenu("Edit");
		editmenu.add(new JSeparator());
		JMenu viewmenu = new JMenu("View");
		viewmenu.add(new JSeparator());
		JMenu contactmenu = new JMenu("Contact Us");
		contactmenu.add(new JSeparator());
		JMenuItem fileItem1 = new JMenuItem("New");
		JMenuItem fileItem2 = new JMenuItem("Open");
		JMenuItem fileItem3 = new JMenuItem("Close");
		fileItem3.add(new JSeparator());
		JMenuItem fileItem4 = new JMenuItem("Save");
		JMenuItem editItem1 = new JMenuItem("Add Student");
		JMenuItem editItem2 = new JMenuItem("Delete Student");
		editItem2.add(new JSeparator());
		JMenuItem editItem3 = new JMenuItem("Update");

		filemenu.add(fileItem1);
		filemenu.add(fileItem2);
		filemenu.add(fileItem3);
		filemenu.add(fileItem4);
		editmenu.add(editItem1);
		editmenu.add(editItem2);
		editmenu.add(editItem3);

		menubar.add(filemenu);
		menubar.add(editmenu);
		menubar.add(viewmenu);
		menubar.add(contactmenu);
		frame.setJMenuBar(menubar);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	public void setVisible(boolean b) {

	}
}