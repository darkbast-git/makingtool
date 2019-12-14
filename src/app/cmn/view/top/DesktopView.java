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

import app.cmn.ConstantsWord;
import app.cmn.view.__abstract._DesktopView;
import app.tool.insertParam.InsertParamLogic;
import app.tool.memo.RefMemoLogic;
import app.tool.rest.RestLogic;

public class DesktopView extends _DesktopView{
    JMenuBar menuBar = null;
	JMenu menuFunc = null;
	JMenuItem miRefMemo = null;
	JMenuItem miRest = null;
	JMenuItem miInsertParam = null;
	
	public DesktopView(){
		setSize(800, 786);
		menu();
		desktop = new JDesktopPane();
		desktop.setVisible(true);
		setContentPane(desktop);
		setDefaultLookAndFeelDecorated(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void menu(){
		menuBar = new JMenuBar();
		
		menuFunc = new JMenu("機能");
		menuBar.add(menuFunc);
		
		miRefMemo = new JMenuItem(ConstantsWord.MENU_REF_MEMO);
		menuFunc.add(miRefMemo);
		miRefMemo.addActionListener(actRefMenuOpen);
		
		miRest = new JMenuItem(ConstantsWord.MENU_REST);
		menuFunc.add(miRest);
		miRest.addActionListener(actRestOpen);

		miInsertParam  = new JMenuItem(ConstantsWord.MENU_INSERT_PARAM);
		menuFunc.add(miInsertParam);
		miInsertParam.addActionListener(actInsertParamOpen);

		setJMenuBar(menuBar);
	}
	

    public ActionListener actInsertParamOpen = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            try{
                InsertParamLogic insertParam = new InsertParamLogic();
                insertParam.setVisible(true);
                insertParam.setSize(750, 800);
                addView(ConstantsWord.MENU_INSERT_PARAM, insertParam);
            }catch (Exception e) {
                System.out.println(e);
            }
        }
    };
    

	public ActionListener actRestOpen = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            try{
                RestLogic rest = new RestLogic();
                rest.setVisible(true);
                rest.setSize(750, 800);
                addView(ConstantsWord.MENU_REST, rest);
            }catch (Exception e) {
                System.out.println(e);
            }
        }
	};
	
	public ActionListener actRefMenuOpen = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			try{
				RefMemoLogic refMemo = new RefMemoLogic();
				refMemo.setVisible(true);
				refMemo.setSize(750, 800);
				addView(ConstantsWord.MENU_REF_MEMO, refMemo);
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
    public InternalFrameListener actRestClose = new InternalFrameAdapter() {
        
        @Override
        public void internalFrameClosed(InternalFrameEvent e) {
            super.internalFrameClosed(e);
            removeView(ConstantsWord.MENU_REST);
        }
    };
}
