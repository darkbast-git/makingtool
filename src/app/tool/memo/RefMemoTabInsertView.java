package app.tool.memo;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JTextField;

public class RefMemoTabInsertView extends JPanel{

	private static final long serialVersionUID = 1L;
	public String role;
	public String title;
	private JTextField tInsTitle;
	private JTextField tInsTag;
	
	public RefMemoTabInsertView(){
		setLayout(null);
		
		JScrollPane insScrPane = new JScrollPane();
		insScrPane.setBounds(81, 64, 613, 434);
		add(insScrPane);
		
		JTextArea taInsContent = new JTextArea();
		insScrPane.setViewportView(taInsContent);
		
		tInsTitle = new JTextField();
		tInsTitle.setBounds(81, 32, 613, 21);
		add(tInsTitle);
		tInsTitle.setColumns(10);
		
		JLabel lblInsTitle = new JLabel("타이틀명");
		lblInsTitle.setBounds(12, 35, 57, 15);
		add(lblInsTitle);
		
		JLabel lblInsContent = new JLabel("내용");
		lblInsContent.setBounds(12, 69, 57, 15);
		add(lblInsContent);
		
		JLabel lblTag = new JLabel("태그");
		lblTag.setBounds(12, 10, 57, 15);
		add(lblTag);
		
		tInsTag = new JTextField();
		tInsTag.setBounds(81, 7, 613, 21);
		add(tInsTag);
		tInsTag.setColumns(10);
		
		JButton btnNewButton = new JButton("등록하기");
		btnNewButton.setBounds(597, 508, 97, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("상태 : ");
		lblNewLabel.setBounds(12, 512, 573, 15);
		add(lblNewLabel);
        
	}
}
