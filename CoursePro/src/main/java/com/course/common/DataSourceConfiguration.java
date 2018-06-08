/**
 * 
 */
package com.course.common;

import java.beans.PropertyVetoException;

import javax.validation.Valid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 数据库连接池创建
 * @author  hujuhui
 * @version 2018年5月23日 下午5:32:40
 */
@Configuration
@MapperScan("com.course.dao")
public class DataSourceConfiguration {
	@Value("${jdbc.driver}")
	private String jdbcDriver;
	@Value("${jdbc.url}")
	private String jdbcUrl;
	@Value("${jdbc.username}")
	private String jdbcUsername;
	@Value("${jdbc.password}")
	private String jdbcPassword;

	
	@Bean(name="datasource")
	public ComboPooledDataSource createDataSource() throws PropertyVetoException{
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass(jdbcDriver);
		dataSource.setJdbcUrl(jdbcUrl);
		dataSource.setUser(jdbcUsername);
		dataSource.setPassword(jdbcPassword);
		//关闭连接后不自动commit
		dataSource.setAutoCommitOnClose(false);
		return dataSource;
	}
}
