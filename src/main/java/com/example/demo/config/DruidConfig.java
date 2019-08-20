package com.example.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
//@EnableConfigurationProperties({DruidProperties.class})
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
        ds.setConnectionProperties(properties.getConnectionProperties());
        try {
            ds.setFilters(properties.getFilters());
            ds.init();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ds;
    }

    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        servletRegistrationBean.addInitParameter("allow","127.0.0.1");  //设置ip白名单
        servletRegistrationBean.addInitParameter("deny","192.168.0.19");//设置ip黑名单，优先级高于白名单
        //设置控制台管理用户
        servletRegistrationBean.addInitParameter("loginUsername","cici");
        servletRegistrationBean.addInitParameter("loginPassword","root");
        //是否可以重置数据
        servletRegistrationBean.addInitParameter("resetEnable","false");
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean statFilter(){
        //创建过滤器
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
        //设置过滤器过滤路径
        filterRegistrationBean.addUrlPatterns("/*");
        //忽略过滤的形式
        filterRegistrationBean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }
}
