package db;

import java.io.InputStream;
import java.io.Reader;
import java.sql.Connection;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SimpleBatisConnect {

    private Connection conn;
    private SqlSession session;
    private static SqlSessionFactory sqlSessionFactory;

    private SimpleBatisConnect(){}

    public static synchronized SqlSessionFactory getInstance(){

        try{
            if (sqlSessionFactory == null){
                Reader reader = Resources.getResourceAsReader("res/mybatis-config.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            }
        }catch(Exception e){
            System.out.println(e);
        }

        return sqlSessionFactory;
    }

    public  void commit() throws Exception{
        SqlSession session = sqlSessionFactory.openSession();
        if (session != null){
            Connection conn = session.getConnection();
            conn.commit();
        }
    }
}
