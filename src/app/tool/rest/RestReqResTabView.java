package app.tool.rest;

import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;

public class RestReqResTabView extends JTabbedPane{
	public RestReqResTabView() {
		
		JPanel panel = new JPanel();
		addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 35, 358, 562);
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(382, 35, 374, 562);
		panel.add(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		
		JLabel lblReq = new JLabel("Request");
		lblReq.setBounds(12, 10, 140, 15);
		panel.add(lblReq);
		
		JLabel lblNewLabel = new JLabel("Response");
		lblNewLabel.setBounds(382, 10, 230, 15);
		panel.add(lblNewLabel);
		
		JButton btnReqCopy = new JButton("Req Copy");
		btnReqCopy.setBounds(273, 6, 97, 23);
		panel.add(btnReqCopy);
		
		JButton btnResCopy = new JButton("Res Copy");
		btnResCopy.setBounds(659, 6, 97, 23);
		panel.add(btnResCopy);
	}
}
