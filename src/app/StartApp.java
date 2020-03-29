package app;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.cmn.util.DbUtil;
import setting.AppConfig;
import setting.DataConfig;

public class StartApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                DataConfig.class
                , AppConfig.class
        );
        DbUtil db = context.getBean(DbUtil.class);
        System.out.println(db);
        db.CreateUser();

    }

}
