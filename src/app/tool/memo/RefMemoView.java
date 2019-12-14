package app.tool.memo;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class RefMemoView extends JInternalFrame{
    public JButton btnSearch;
    public JTextField txSearch;
    public boolean mode = false;
    public JLabel label;
    public List<Integer> newTabList = new LinkedList<Integer>();
    public Integer newTabCount = 1;
    public RefMemoTabSearchView refMemoTabSearchView;
//    public RefMemoTabUpdView refMemoTabUpdView;
    public RefMemoTabInsertView refMemoTabInsView;
    public JTabbedPane tabbedPane;

    public RefMemoView() {
        getContentPane().setLayout(null);

        JPanel pSearch = new JPanel();
        pSearch.setBounds(12, 10, 708, 79);
        getContentPane().add(pSearch);
        pSearch.setLayout(null);

        btnSearch = new JButton("검색");
        btnSearch.setBounds(633, 11, 63, 58);
        pSearch.add(btnSearch);

        txSearch = new JTextField();
        txSearch.setBounds(85, 48, 536, 21);
        pSearch.add(txSearch);
        txSearch.setColumns(10);
        
        label = new JLabel("구분");
        label.setBounds(12, 14, 57, 15);
        pSearch.add(label);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(87, 11, 198, 21);
        pSearch.add(comboBox);
        
        JLabel lblNewLabel = new JLabel("검색명");
        lblNewLabel.setBounds(12, 51, 57, 15);
        pSearch.add(lblNewLabel);
        
        JLabel lblTag = new JLabel("태그");
        lblTag.setBounds(297, 14, 57, 15);
        pSearch.add(lblTag);
        
        JComboBox comboBox_1 = new JComboBox();
        comboBox_1.setBounds(336, 11, 285, 21);
        pSearch.add(comboBox_1);
        
        tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBounds(12, 109, 708, 559);
        getContentPane().add(tabbedPane);
        
        refMemoTabSearchView = new RefMemoTabSearchView();
        tabbedPane.addTab("검색", null, refMemoTabSearchView, null);
        
        refMemoTabInsView = new RefMemoTabInsertView();
        tabbedPane.addTab("등록", null, refMemoTabInsView, null);
//        
//        refMemoTabUpdView = new RefMemoTabUpdView();
//        tabbedPane.addTab("갱신", null, refMemoTabUpdView, null);
        
    }
}
