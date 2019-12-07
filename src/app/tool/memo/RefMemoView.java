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

@SuppressWarnings("serial")
public class RefMemoView extends JInternalFrame{
    public JButton btnSearch;
    public JTextField txSearch;
    public JTextArea taContents;
    public JList<String> lstList;
    public boolean mode = false;
    public JButton btnInsert;
    public JButton btnUpdate;
    private JLabel label;

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

        JPanel pContents = new JPanel();
        pContents.setBounds(316, 99, 406, 440);
        getContentPane().add(pContents);
        pContents.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(12, 10, 382, 420);
        pContents.add(scrollPane);

        taContents = new JTextArea();
        scrollPane.setViewportView(taContents);

        JPanel pList = new JPanel();
        pList.setBounds(12, 99, 292, 440);
        getContentPane().add(pList);
        pList.setLayout(null);

        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(12, 10, 268, 420);
        pList.add(scrollPane_1);

        lstList = new JList();
        scrollPane_1.setViewportView(lstList);
        
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
    }
}
