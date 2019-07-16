package com.example.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
public class DruidConfig {

    @Autowired
    DruidProperties properties;

    @Bean
    @Primary
    public DataSource dataSource(){
        DruidDataSource ds = new DruidDataSource();

        ds.setDriverClassName(properties.getDriver());
        ds.setUrl(properties.getUrl());
        ds.setUsername(properties.getUsername());
        ds.setPassword(properties.getPassword());
        ds.setInitialSize(properties.getInitialSize());
        ds.setMinIdle(properties.getMinIdle());
        ds.setMaxActive(properties.getMaxActive());
        ds.setMaxWait(properties.getMaxWait());
        ds.setPoolPreparedStatements(properties.getPoolPreparedStatements());
        ds.setMaxOpenPreparedStatements(properties.getMaxOpenPreparedStatements());
        ds.setValidationQuery(properties.getValidationQuery());
        ds.setTestOnBorrow(properties.getTestOnBorrow());
        ds.setTestOnReturn(properties.getTestOnReturn());
        ds.setTestWhileIdle(properties.getTestWhileIdle());
        ds.setTimeBetweenEvictionRunsMillis(properties.getTimeBetweenEvictionRunsMillis());
        ds.setMinEvictableIdleTimeMillis(properties.getMinEvictableIdleTimeMillis());
        return ds;
    }
}
