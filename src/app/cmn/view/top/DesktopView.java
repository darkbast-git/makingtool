package app.cmn.view.top;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

import app.cmn.view.__abstract._DesktopView;
import app.tool.memo.RefMemoLogic;

public class DesktopView extends _DesktopView{
	JMenuBar menuBar = null;
	JMenu menuFunc = null;
	JMenuItem menuItemRefMemo = null;
	
	public DesktopView(){
		setSize(800, 786);
		menu();
		desktop = new JDesktopPane();
		desktop.setVisible(true);
		setContentPane(desktop);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void menu(){
		menuBar = new JMenuBar();
		
		menuFunc = new JMenu("File");
		menuBar.add(menuFunc);
		
		menuItemRefMemo = new JMenuItem("RefMenu");
		menuFunc.add(menuItemRefMemo);
		menuItemRefMemo.addActionListener(actRefMenuOpen);
		
		setJMenuBar(menuBar);
	}
	
	public ActionListener actRefMenuOpen = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			try{
				RefMemoLogic refMemo = new RefMemoLogic();
//				desktop.add(refMemo);
				refMemo.setVisible(true);
				refMemo.setSize(500, 100);
				addView("refMemo", refMemo);
//				refMemo.setClosable(true);
//				refMemo.setVisible(true);
//				refMemo.addInternalFrameListener(actRefMemoClose);
			}catch (Exception e) {
				System.out.println(e);
			}
		}
	};
	
	public InternalFrameListener actRefMemoClose = new InternalFrameAdapter() {
		
		@Override
		public void internalFrameClosed(InternalFrameEvent e) {
			super.internalFrameClosed(e);
			removeView("refMemo");
		}
	};
}
