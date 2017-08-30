package config;

import java.beans.PropertyVetoException;
import java.io.IOException;

import javax.sql.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableAspectJAutoProxy  //启用Spring AOP
@EnableTransactionManagement(proxyTargetClass=false)//启用注解式事务
@PropertySource(value={"classpath:db.properties"})
@ComponentScan(basePackages={"service.impl"},useDefaultFilters=true)
@MapperScan(basePackages="dao",sqlSessionFactoryRef="factoryBean")//mybatis Dao接口
@Import( value={TransactionConfig.class,EmailConfig.class})
public class RootConfig {
@Autowired	
private Environment env;
/**
 * sqlsession工厂
 * @param dataSource
 * @param applicationContext
 * @return
 * @throws IOException
 */
@Bean("factoryBean")
public SqlSessionFactoryBean factoryBean(DataSource dataSource,ApplicationContext applicationContext) throws IOException{
	Resource[] resources = applicationContext.getResources("classpath:mapping/*.xml");//加载mybatis映射文件
	SqlSessionFactoryBean bean=new SqlSessionFactoryBean();
	//bean.setTypeAliasesPackage("entity");//别名
//	bean.setMapperLocations(new Resource[]{new ClassPathResource("classpath*mappering/*Mapper.xml")});
	bean.setMapperLocations(resources);//加载mybatis映射文件
	bean.setDataSource(dataSource);
	return bean;
}

@Bean
public DataSource dataSource() throws PropertyVetoException{
	ComboPooledDataSource comboPooledDataSource=new ComboPooledDataSource();
	//System.out.println(user+url+password+driverClass);
	comboPooledDataSource.setUser(env.getProperty("db.user"));
	comboPooledDataSource.setJdbcUrl(env.getProperty("db.url"));
	comboPooledDataSource.setPassword(env.getProperty("db.password"));
	comboPooledDataSource.setDriverClass(env.getProperty("db.driverClass"));
	return comboPooledDataSource;
	
}
}