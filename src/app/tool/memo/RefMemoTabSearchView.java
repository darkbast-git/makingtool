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
	
	public RefMemoTabSearchView(){
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 312, 542);
		add(panel);
		panel.setLayout(null);
		
		JList list = new JList();
		list.setBounds(0, 0, 312, 542);
		panel.add(list);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(324, 0, 382, 542);
		add(scrollPane);
		
		JTextArea taContent = new JTextArea();
		scrollPane.setViewportView(taContent);
        
	}
}
