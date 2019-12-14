package app.tool.socket;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JFileChooser;
import javax.swing.JButton;

public class SocketView extends JInternalFrame{
    private JTextField txHost;
    private JTextField txPort;
    private JTextField textField;
    public SocketView() {
        getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBounds(12, 10, 588, 69);
        getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblHost = new JLabel("HOST");
        lblHost.setBounds(12, 13, 57, 15);
        panel.add(lblHost);
        
        JLabel lblPort = new JLabel("PORT");
        lblPort.setBounds(12, 35, 57, 15);
        panel.add(lblPort);
        
        txHost = new JTextField();
        txHost.setBounds(67, 7, 116, 21);
        panel.add(txHost);
        txHost.setColumns(10);
        
        txPort = new JTextField();
        txPort.setBounds(67, 32, 116, 21);
        panel.add(txPort);
        txPort.setColumns(10);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(12, 162, 588, 246);
        getContentPane().add(scrollPane);
        
        JTextArea textArea = new JTextArea();
        scrollPane.setViewportView(textArea);
        
        JButton btnSelectFile = new JButton("파일선택");
        btnSelectFile.setBounds(12, 89, 97, 23);
        getContentPane().add(btnSelectFile);
        
        textField = new JTextField();
        textField.setBounds(121, 90, 479, 21);
        getContentPane().add(textField);
        textField.setColumns(10);
    }
}
