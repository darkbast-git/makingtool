package app.tool.memo;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class RefMemoView extends JInternalFrame{
    public JButton btnSearch;
    public JTextField txSearch;
    public boolean mode = false;
    public JButton btnInsert;
    public JButton btnUpdate;
    public JLabel label;
    public RefMemoTabSearchView refMemoTabSearchView;

    public RefMemoView() {
        getContentPane().setLayout(null);

        JPanel pSearch = new JPanel();
        pSearch.setBounds(12, 10, 538, 79);
        getContentPane().add(pSearch);
        pSearch.setLayout(null);

        btnSearch = new JButton("검색");
        btnSearch.setBounds(460, 10, 63, 59);
        pSearch.add(btnSearch);

        txSearch = new JTextField();
        txSearch.setBounds(87, 48, 363, 21);
        pSearch.add(txSearch);
        txSearch.setColumns(10);
        
        label = new JLabel("구분");
        label.setBounds(12, 14, 57, 15);
        pSearch.add(label);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(87, 11, 361, 21);
        pSearch.add(comboBox);
        
        JLabel lblNewLabel = new JLabel("검색명");
        lblNewLabel.setBounds(12, 51, 57, 15);
        pSearch.add(lblNewLabel);
        
        JPanel panel = new JPanel();
        panel.setBounds(579, 10, 130, 79);
        getContentPane().add(panel);
        panel.setLayout(null);
        
        btnUpdate = new JButton("갱신");
        btnUpdate.setBounds(12, 13, 106, 23);
        panel.add(btnUpdate);
        
        btnInsert = new JButton("등록");
        btnInsert.setBounds(12, 46, 106, 23);
        panel.add(btnInsert);
        
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBounds(12, 109, 708, 559);
        getContentPane().add(tabbedPane);
        
        refMemoTabSearchView = new RefMemoTabSearchView();
        tabbedPane.addTab("검색", null, refMemoTabSearchView, null);

    }
}
