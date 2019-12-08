package app.tool.memo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import db.SqliteConnect;

@SuppressWarnings("serial")
public class RefMemoLogic extends RefMemoView{
    
	@Autowired
	private ApplicationContext context;
	
    private SqliteConnect sqlite = null;
    
    public RefMemoLogic() throws Exception{
        setSize(680,495);
        setVisible(true);
        init();
//        readyDB();
        addListner();
        System.out.println(context);

    }
    
    
    public void init(){
        btnUpdate.setEnabled(false);
        btnInsert.setEnabled(false);
    }
    
    public void readyDB() throws Exception{
        sqlite = new SqliteConnect();
        
    }
    
    public void addListner(){
//        public JButton btnSearch;
//        public JButton btnUpdate;
//        public JTextField txSearch;
//        public JTextArea taContents;
//        public JList<String> lstList;
//        public JButton btnInsertMode;
//        public JButton btnInsert;
//        btnSearch.addActionListener(l);
//        btnInsertMode.addActionListener(actBtnSearch);
    	btnUpdate.addActionListener(actBtnUpdate);
    }
    
    public ActionListener actBtnUpdate = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	};
    
    private ActionListener actBtnSearch = new ActionListener() {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            String search = txSearch.getText();
            try{
                
                String[] searchArr = search.split("\\s");
                
//                String sql = 
                
//                Connection c = sqlite.getConnection();
//                PreparedStatement ps = c.prepareStatement(sql);
                
//                ps.execute();
                
                
            }catch(Exception se){
                
            }
        }
    };
    
    private ActionListener actBtnInsertMode = new ActionListener() {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            // 등록모드 사용중
            if (mode) {
                // 사용해제하기
                mode = false;
                btnInsert.setEnabled(false);
                // 
                
            }
                
            if (!mode)
                mode = true;
                btnInsert.setEnabled(true);
                btnSearch.setEnabled(false);
                btnUpdate.setEnabled(true);
        }
    };
    
    
    
    
   

}
