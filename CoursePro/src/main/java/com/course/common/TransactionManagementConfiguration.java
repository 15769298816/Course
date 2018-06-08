package com.course.common;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

/**
  * 对标spring-service里面的transactionManager
 * 继承TransactionManagementConfigurer是因为开启annotation-driven
 * @author  hujuhui
 * @version 2018年5月24日 下午4:42:07
 */

//首先使用注解 @EnableTransactionManagement 开启事务支持后
//在Service方法上添加注解 @Transactional 便可
@Configuration
@EnableTransactionManagement
public class TransactionManagementConfiguration implements TransactionManagementConfigurer{
	// 注入DataSourceConfiguration里边的dataSource,通过createDataSource()获取
	@Autowired
	private DataSource dataSource;
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		
		return new DataSourceTransactionManager(dataSource);
	}
}
