package app.tool.insertParam;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

import app.cmn.view.ext.ExtJLabelStatus;
import app.cmn.view.ext.ExtJList;

public class InsertParamView extends JInternalFrame{
    // COMMON
    public ExtJLabelStatus lblStatus;
    
    // 1P
    public JTextArea taSql;
    public JTextArea taParam;
    public JTextArea taRet;

    public JButton btnRetCopy;
    public JButton btnChange;
    public JButton btnVaccum;
    

    public JCheckBox chkParamChg;
    public JCheckBox chkTimeChg;

    // 2P
    public JTextArea taChgParam;
    public JTextArea taChgRet;
    public JCheckBox chkTab;
    public JCheckBox chkLine;
    public JCheckBox chkComma;
    public ExtJList lstItem;
    public JButton btnP2RetCopy;
    public JButton btnP2Ret;


    public InsertParamView() {
        getContentPane().setLayout(null);
        setSize(new Dimension(720,735));
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBounds(12, 28, 690, 664);
        getContentPane().add(tabbedPane);

        JPanel panel = new JPanel();
        tabbedPane.addTab("パラメータ入力", null, panel, null);
        panel.setLayout(null);

        JLabel lblParameter = new JLabel("SQL");
        lblParameter.setBounds(12, 122, 149, 15);
        panel.add(lblParameter);

        JScrollPane scrollPane_2 = new JScrollPane();
        scrollPane_2.setBounds(12, 147, 661, 125);
        panel.add(scrollPane_2);

        taSql = new JTextArea();
        scrollPane_2.setViewportView(taSql);

        JLabel lblNewLabel = new JLabel("パラメータ");
        lblNewLabel.setBounds(12, 282, 127, 15);
        panel.add(lblNewLabel);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(12, 307, 661, 89);
        panel.add(scrollPane);

        taParam = new JTextArea();
        scrollPane.setViewportView(taParam);

        JLabel lblRet = new JLabel("結果");
        lblRet.setBounds(12, 431, 57, 15);
        panel.add(lblRet);

        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(12, 456, 661, 169);
        panel.add(scrollPane_1);

        taRet = new JTextArea();
        scrollPane_1.setViewportView(taRet);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(12, 37, 661, 40);
        panel.add(panel_1);
        panel_1.setLayout(null);

        chkParamChg = new JCheckBox("パラメータ入力方変換");
        chkParamChg.setToolTipText("パラメータを入力選択方に変換する。");
        chkParamChg.setBounds(8, 6, 162, 23);
        panel_1.add(chkParamChg);

         chkTimeChg = new JCheckBox("ミリ秒整理");
       chkTimeChg.setToolTipText("年月日　時分秒　ミリ表削除");
        chkTimeChg.setBounds(246, 6, 162, 23);
        panel_1.add(chkTimeChg);

        JCheckBox chk1 = new JCheckBox("未定義");
        chk1.setBounds(458, 6, 195, 23);
        panel_1.add(chk1);

        JLabel lblCmd = new JLabel("コマンド");
        lblCmd.setBounds(12, 10, 73, 15);
        panel.add(lblCmd);

        btnChange = new JButton("変換");
        btnChange.setBounds(576, 427, 97, 23);
        panel.add(btnChange);

        btnVaccum = new JButton("整理");
        btnVaccum.setBounds(467, 427, 97, 23);
        panel.add(btnVaccum);

        btnRetCopy = new JButton("結果COPY");
        btnRetCopy.setBounds(355, 427, 97, 23);
        panel.add(btnRetCopy);

        JPanel panel_2 = new JPanel();
        tabbedPane.addTab("変換", null, panel_2, null);
        panel_2.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("入力値");
        lblNewLabel_1.setBounds(12, 10, 57, 15);
        panel_2.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("結果");
        lblNewLabel_2.setBounds(12, 218, 57, 15);
        panel_2.add(lblNewLabel_2);

        JScrollPane scrollPane_3 = new JScrollPane();
        scrollPane_3.setBounds(12, 243, 661, 151);
        panel_2.add(scrollPane_3);

        taChgRet = new JTextArea();
        scrollPane_3.setViewportView(taChgRet);

        JLabel lblNewLabel_3 = new JLabel("オプション");
        lblNewLabel_3.setBounds(12, 414, 141, 15);
        panel_2.add(lblNewLabel_3);

        JPanel panel_4 = new JPanel();
        panel_4.setBounds(12, 439, 661, 204);
        panel_2.add(panel_4);
        panel_4.setLayout(null);

        JLabel lblItem = new JLabel("変更項目");
        lblItem.setBounds(12, 10, 121, 15);
        panel_4.add(lblItem);

        lstItem = new ExtJList();
        lstItem.setBounds(12, 35, 273, 159);
        panel_4.add(lstItem);

        JLabel lblTarget = new JLabel("認識対象");
        lblTarget.setBounds(378, 10, 57, 15);
        panel_4.add(lblTarget);

        JPanel panel_5 = new JPanel();
        panel_5.setBounds(376, 35, 273, 159);
        panel_4.add(panel_5);
        panel_5.setLayout(null);

        chkLine = new JCheckBox("改行");
        chkLine.setBounds(8, 6, 115, 23);
        chkLine.setSelected(true);
        panel_5.add(chkLine);

        chkComma = new JCheckBox("コンマ");
        chkComma.setBounds(8, 31, 115, 23);
        chkComma.setSelected(true);
        panel_5.add(chkComma);

        chkTab = new JCheckBox("タブ");
        chkTab.setBounds(8, 56, 115, 23);
        chkTab.setSelected(true);
        panel_5.add(chkTab);

        JScrollPane scrollPane_4 = new JScrollPane();
        scrollPane_4.setBounds(12, 35, 661, 173);
        panel_2.add(scrollPane_4);

        taChgParam = new JTextArea();
        scrollPane_4.setViewportView(taChgParam);
        
         btnP2Ret = new JButton("変換");
        btnP2Ret.setBounds(576, 404, 97, 23);
        panel_2.add(btnP2Ret);
        
        btnP2RetCopy = new JButton("Result Copy");
        btnP2RetCopy.setBounds(373, 404, 141, 23);
        panel_2.add(btnP2RetCopy);
        
        lblStatus = new ExtJLabelStatus();
        lblStatus.setBounds(12, 10, 680, 15);
        getContentPane().add(lblStatus);
    }
}
