package setting;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import app.cmn.util.DbUtil;
import app.cmn.view.top.DesktopLogic;

@Configuration
@ComponentScan("app")
public class AppConfig {
    @Bean
    public DesktopLogic desktopLogic(){
        return new DesktopLogic();
    }

    @Bean
    public DbUtil dbUtil(){
        return new DbUtil();
    }
}
