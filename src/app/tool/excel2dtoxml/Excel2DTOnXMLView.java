package app.tool.excel2dtoxml;

import javax.swing.JInternalFrame;
import javax.swing.JTree;

public class Excel2DTOnXMLView extends JInternalFrame{
    public Excel2DTOnXMLView() {
        getContentPane().setLayout(null);
        
        JTree tree = new JTree();
        tree.setBounds(12, 10, 308, 305);
        getContentPane().add(tree);
    }
}
