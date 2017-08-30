package config;

import javax.sql.DataSource;

import org.aspectj.apache.bcel.generic.ReturnaddressType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

@Configuration
@EnableTransactionManagement
public class TransactionConfig implements TransactionManagementConfigurer{
	@Autowired
	private DataSource dataSource;
	@Bean("transactionManager")
	@Override
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		System.out.println(dataSource+"123");
		return new DataSourceTransactionManager(dataSource);
	}

	
}
