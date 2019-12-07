package app.tool.helpdbedit;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTable;

public class HelpDbEditView2 extends JInternalFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	public HelpDbEditView2() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 686, 44);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton button = new JButton(" 추가커넥션");
		button.setBounds(12, 10, 97, 23);
		panel.add(button);
		
		JButton btnNewButton = new JButton("연결");
		btnNewButton.setBounds(577, 10, 97, 23);
		panel.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(360, 11, 205, 21);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 64, 686, 44);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("연결정보");
		lblNewLabel.setBounds(12, 10, 57, 15);
		panel_1.add(lblNewLabel);
		
		JLabel lblDb = new JLabel("DB명");
		lblDb.setBounds(175, 10, 81, 15);
		panel_1.add(lblDb);
		
		JLabel lblNewLabel_3 = new JLabel("포트명");
		lblNewLabel_3.setBounds(325, 10, 81, 15);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("현재테이블");
		lblNewLabel_4.setBounds(461, 10, 81, 15);
		panel_1.add(lblNewLabel_4);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(12, 118, 686, 611);
		getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 10, 198, 392);
		panel_4.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("테이블명검색");
		lblNewLabel_1.setBounds(12, 10, 174, 15);
		panel_2.add(lblNewLabel_1);
		
		JList list = new JList();
		list.setBounds(12, 43, 1, 1);
		panel_2.add(list);
		
		textField = new JTextField();
		textField.setToolTipText("테이블검색");
		textField.setBounds(12, 35, 174, 21);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JList list_1 = new JList();
		list_1.setBounds(12, 66, 174, 316);
		panel_2.add(list_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(244, 10, 430, 392);
		panel_4.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("칼럼명, 코멘트, 대략적인 변수명");
		lblNewLabel_2.setBounds(12, 10, 406, 15);
		panel_3.add(lblNewLabel_2);
		
		JList list_2 = new JList();
		list_2.setBounds(12, 66, 184, 316);
		panel_3.add(list_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 35, 406, 21);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JList list_3 = new JList();
		list_3.setBounds(208, 66, 210, 316);
		panel_3.add(list_3);
		
		table = new JTable();
		table.setBounds(12, 437, 662, 126);
		panel_4.add(table);
		
		JLabel label = new JLabel("컬럼명, 코멘트, 대략적인 변수명 취득");
		label.setBounds(12, 412, 662, 15);
		panel_4.add(label);
		
		JButton btnNewButton_1 = new JButton("취득");
		btnNewButton_1.setBounds(12, 578, 97, 23);
		panel_4.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DTO작성");
		btnNewButton_2.setBounds(121, 578, 97, 23);
		panel_4.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("INSERT작성");
		btnNewButton_3.setBounds(414, 578, 123, 23);
		panel_4.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("업데이트 작성");
		btnNewButton_4.setBounds(545, 578, 129, 23);
		panel_4.add(btnNewButton_4);
	}
}
