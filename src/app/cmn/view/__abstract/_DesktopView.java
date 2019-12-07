package app.cmn.view.__abstract;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public abstract class _DesktopView extends JFrame{
	public _DesktopView() {
	}
	private Map<String, Object> viewMap = new LinkedHashMap<String, Object>();
	public JDesktopPane desktop = null;
	
	public boolean isNotExistView(String key){
		Object obj = viewMap.get(key);
		return obj == null;
	}
	
	public void addView(String key, JInternalFrame val){
		if (isNotExistView(key)){
			desktop.add(val);
			val.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			val.setVisible(true);
			viewMap.put(key, val);
		}
	}
	
	public void removeView(String key){
		viewMap.remove(key);
	}
	
}
