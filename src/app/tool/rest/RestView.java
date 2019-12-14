package app.tool.rest;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import app.cmn.view.ext.ExtJComboBox;

public class RestView extends JInternalFrame{
    public JTextField textField;
	public ExtJComboBox cbMethod;
	public ExtJComboBox cbContentType;
	public RestView() {
		getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 10, 795, 750);
		getContentPane().add(tabbedPane);
		
		JPanel tabMain = new JPanel();
		tabbedPane.addTab("New tab", null, tabMain, null);
		tabMain.setLayout(null);
		
		JLabel lblUrl = new JLabel("URL");
		lblUrl.setBounds(12, 13, 57, 15);
		tabMain.add(lblUrl);
		
		textField = new JTextField();
		textField.setBounds(81, 10, 602, 21);
		tabMain.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("보내기");
		btnNewButton.setBounds(696, 9, 82, 44);
		tabMain.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("METHOD");
		lblNewLabel.setBounds(12, 38, 57, 15);
		tabMain.add(lblNewLabel);
		
        cbMethod = new ExtJComboBox();
        cbMethod.setBounds(81, 35, 100, 21);
        tabMain.add(cbMethod);
		
		JLabel lblNewLabel_1 = new JLabel("Content-Type");
		lblNewLabel_1.setBounds(192, 38, 90, 15);
		tabMain.add(lblNewLabel_1);
		
		cbContentType = new ExtJComboBox();
		cbContentType.setBounds(287, 35, 150, 21);
		tabMain.add(cbContentType);
		
		JLabel lblNewLabel_2 = new JLabel("CHARSET");
		lblNewLabel_2.setBounds(464, 38, 57, 15);
		tabMain.add(lblNewLabel_2);
		
		JComboBox cbCharSet = new JComboBox();
		cbCharSet.setBounds(533, 35, 150, 21);
		tabMain.add(cbCharSet);
		
		RestReqResTabView restReqResTabView = new RestReqResTabView();
		restReqResTabView.setBounds(12, 73, 766, 638);
		tabMain.add(restReqResTabView);
	}
}
