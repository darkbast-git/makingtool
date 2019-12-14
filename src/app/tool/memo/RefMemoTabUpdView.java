package app.tool.memo;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JTextField;

public class RefMemoTabUpdView extends JPanel{

	private static final long serialVersionUID = 1L;
	public String role;
	public String title;
	private JTextField taUpdTitle;
	private JTextField tUpdTag;
	
	public RefMemoTabUpdView(){
		setLayout(null);
		
		JScrollPane updScrPane = new JScrollPane();
		updScrPane.setBounds(81, 64, 614, 427);
		add(updScrPane);
		
		JTextArea taUpdContent = new JTextArea();
		updScrPane.setViewportView(taUpdContent);
		
		taUpdTitle = new JTextField();
		taUpdTitle.setBounds(81, 32, 614, 21);
		add(taUpdTitle);
		taUpdTitle.setColumns(10);
		
		JLabel lblUpdTitle = new JLabel("타이틀명");
		lblUpdTitle.setBounds(12, 35, 57, 15);
		add(lblUpdTitle);
		
		JLabel lblUpdContent = new JLabel("내용");
		lblUpdContent.setBounds(12, 69, 57, 15);
		add(lblUpdContent);
		
		JLabel lblUpdTag = new JLabel("태그");
		lblUpdTag.setBounds(12, 10, 57, 15);
		add(lblUpdTag);
		
		tUpdTag = new JTextField();
		tUpdTag.setBounds(81, 7, 614, 21);
		add(tUpdTag);
		tUpdTag.setColumns(10);
		
		JButton btnNewButton = new JButton("갱신");
		btnNewButton.setBounds(598, 511, 97, 23);
		add(btnNewButton);
		
		JLabel lblUpdSts = new JLabel("상태 : ");
		lblUpdSts.setBounds(12, 515, 574, 15);
		add(lblUpdSts);
        
	}
}
