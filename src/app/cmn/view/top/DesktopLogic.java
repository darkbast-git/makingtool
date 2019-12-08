package app.cmn.view.top;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DesktopLogic extends DesktopView{
	private ApplicationContext context = null;
	
	public DesktopLogic(){
		context = new GenericXmlApplicationContext("context-db.xml");
		System.out.println(context);
	}
}
