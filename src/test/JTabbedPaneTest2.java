package test;


import javax.swing.*;
import java.awt.BorderLayout;

public class JTabbedPaneTest2 extends JFrame{

	public static void main(String[] args){
		JTabbedPaneTest2 frame = new JTabbedPaneTest2();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(10, 10, 300, 200);
		frame.setTitle("タイトル");
		frame.setVisible(true);
	}

	JTabbedPaneTest2(){
		JTabbedPane tabbedpane = new JTabbedPane();

		JPanel tabPanel1 = new JPanel();
		tabPanel1.add(new JButton("button1"));

		JPanel tabPanel2 = new JPanel();
		tabPanel2.add(new JLabel("Name:"));
		tabPanel2.add(new JTextField("", 10));

		tabbedpane.addTab("tab1", tabPanel1);
		tabbedpane.addTab("tab2", tabPanel2);

		getContentPane().add(tabbedpane, BorderLayout.CENTER);
	}
}

