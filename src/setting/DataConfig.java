package setting;

import java.io.IOException;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternUtils;

@Configuration
@MapperScan("app.cmn.dao")
public class DataConfig {
    
//    private String url = "jdbc:sqlite:E:/workspace_svn/java/dev/MakeTool/test.db";
//    private String className = "org.sqlite.JDBC";
    @Bean(destroyMethod="close")
    public BasicDataSource dataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("org.sqlite.JDBC");
        dataSource.setUrl("jdbc:sqlite:mydb.db");
        return dataSource;
    }

    /**
     * SqlSessionFactoryBean格納クラス。
     *
     * <PRE>
    * DataSourceをSqlSessionFactoryBeanにセットします。
    * mybatisの設定情報をSqlSessionFactoryBeanにセットします。
     * </PRE>
     *
     * @return SqlSessionFactoryBean。
     */
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) throws IOException {
      SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
      factory.setDataSource(dataSource);
      ResourcePatternResolver resolver =
          ResourcePatternUtils.getResourcePatternResolver(new DefaultResourceLoader());
      // MyBatis のコンフィグレーションファイル
      factory.setConfigLocation(resolver.getResource("classpath:resource/mybatis-config.xml"));
      // MyBatis で使用する SQL ファイル群(daoフォルダ内のサブフォルダ内も含んだ全てのxml)
      factory.setMapperLocations(resolver.getResources("classpath:resource/dao/**/*.xml"));

      return factory;
    }
//    @Bean
//    public SqlSessionFactory sqlSessionFactory() throws Exception {
//      SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
////      ResolverUtil<T>
//      factoryBean.setDataSource(dataSource());
//      factoryBean.setConfiguration(configuration);
//      factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:xml/**/*.xml"));
//      return factoryBean.getObject();
//    }
//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) throws Exception {
//      final SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
//      return sqlSessionTemplate;
//    }
// 
//    
}
