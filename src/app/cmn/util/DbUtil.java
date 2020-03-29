package app.cmn.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.cmn.dao.CreateDao;

@Component
public class DbUtil {
    
    @Autowired CreateDao createDao;

    public void CreateUser(){
        System.out.println("createDao : " + createDao);
        
        if (createDao != null){
            createDao.createUser();
        }
    }

//    @Autowired BasicDataSource dataSource;
//    
//    public DbUtil(){
//        System.out.println(dataSource);
//    }
//    
//    public boolean createTbl(){
//        Connection conn;
//        try{
//            conn = dataSource.getConnection();
//            Statement p = conn.createStatement();
//
//            
//        }catch(Exception e){
//            
//        }
//        return true;
//    }
}
