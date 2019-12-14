package app.tool.memo;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JButton;

public class RefMemoTabSearchView extends JPanel{

	private static final long serialVersionUID = 1L;
	public String role;
	public String title;
	public JButton btnSearchUpd;
	public JButton btnLock;
	public JList lstSearchResult;
	public JTextArea taContent;
	
	public RefMemoTabSearchView(){
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 254, 497);
		add(panel);
		panel.setLayout(null);
		
		lstSearchResult = new JList();
		lstSearchResult.setBounds(0, 0, 254, 497);
		panel.add(lstSearchResult);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(344, 10, 350, 497);
		add(scrollPane);
		
		taContent = new JTextArea();
		scrollPane.setViewportView(taContent);
		
		btnSearchUpd = new JButton("갱신");
		btnSearchUpd.setBounds(268, 10, 74, 23);
		add(btnSearchUpd);
		
		btnLock = new JButton("회면락");
		btnLock.setBounds(268, 42, 74, 23);
		add(btnLock);
		
		JLabel lblSearchSts = new JLabel("상태 : ");
		lblSearchSts.setBounds(12, 517, 682, 15);
		add(lblSearchSts);
        
	}
}
