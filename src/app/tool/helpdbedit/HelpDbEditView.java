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

public class HelpDbEditView extends JInternalFrame{
	private JTable table;
	public HelpDbEditView() {
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
		panel_4.setBounds(12, 500, 686, 178);
		getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		table = new JTable();
		table.setBounds(12, 35, 662, 126);
		panel_4.add(table);
		
		JLabel label = new JLabel("컬럼명, 코멘트, 대략적인 변수명 취득");
		label.setBounds(12, 10, 662, 15);
		panel_4.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 688, 686, 41);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("취득");
		btnNewButton_1.setBounds(12, 10, 97, 23);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DTO작성");
		btnNewButton_2.setBounds(121, 10, 97, 23);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("업데이트 작성");
		btnNewButton_4.setBounds(545, 10, 129, 23);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("INSERT작성");
		btnNewButton_3.setBounds(410, 10, 123, 23);
		panel_2.add(btnNewButton_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(12, 118, 686, 372);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		HelpDbEditTabView helpDbEditTabView = new HelpDbEditTabView();
		helpDbEditTabView.setBounds(12, 10, 662, 352);
		panel_3.add(helpDbEditTabView);
	}
}
