package app.tool.memo;

import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class RefMemoTabView extends JTabbedPane{
	public JTextArea taContents;
	public String role;
	public String title;
	
	public RefMemoTabView(){
		JPanel panel = new JPanel();
		addTab("검색", null, panel, null);
		panel.setLayout(null);
		
		JPanel pMemoTitle = new JPanel();
		pMemoTitle.setBounds(12, 10, 287, 441);
		panel.add(pMemoTitle);
		pMemoTitle.setLayout(null);
		
		JList list = new JList();
		list.setBounds(12, 10, 263, 421);
		pMemoTitle.add(list);
		
		JPanel pMemoContent = new JPanel();
		pMemoContent.setBounds(311, 10, 406, 441);
		panel.add(pMemoContent);
		pMemoContent.setLayout(null);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(12, 10, 382, 420);
        pMemoContent.add(scrollPane);

        taContents = new JTextArea();
        scrollPane.setViewportView(taContents);
	}
	
	public RefMemoTabView(String role, String title){
		this();
		this.role = role;
		this.title = title;
	}
}
