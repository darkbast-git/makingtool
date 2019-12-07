package app.tool.helpdbedit;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;

public class HelpDbEditTabView extends JTabbedPane{
	private JTextField textField;
	private JTextField textField_1;
	public HelpDbEditTabView() {
		JPanel a = new JPanel();
		a.setSize(new Dimension(200, 100));
		addTab("1", a);
		a.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("테이블명");
		lblNewLabel.setBounds(12, 10, 57, 15);
		a.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(12, 35, 214, 21);
		a.add(textField);
		textField.setColumns(10);
		
		JList list = new JList();
		list.setBounds(12, 66, 214, 350);
		a.add(list);
		
		textField_1 = new JTextField();
		textField_1.setBounds(238, 35, 531, 21);
		a.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("컬럼명, 코멘트명 타입");
		lblNewLabel_1.setBounds(238, 10, 261, 15);
		a.add(lblNewLabel_1);
		
		JList list_1 = new JList();
		list_1.setBounds(238, 66, 184, 350);
		a.add(list_1);
		
		JList list_2 = new JList();
		list_2.setBounds(434, 66, 198, 350);
		a.add(list_2);
		
		JList list_3 = new JList();
		list_3.setBounds(644, 66, 125, 350);
		a.add(list_3);
		
	}
}
