package test;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JTabbedPaneTest1 extends JFrame{

  public static void main(String[] args){
    JTabbedPaneTest1 frame = new JTabbedPaneTest1();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  JTabbedPaneTest1(){
    JTabbedPane tabbedpane = new JTabbedPane();

    getContentPane().add(tabbedpane, BorderLayout.CENTER);
  }
}