package com.hw.springannotation.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.aop.target.CommonsPool2TargetSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @Description Profile
 * @Author hw
 * @Date 2018/11/29 19:25
 * @Version 1.0
 */
@Component
@PropertySource(value = {"classpath:/datasource.properties"})
public class MainConfigOfProfile implements EmbeddedValueResolverAware {

    @Value("${db.username}")
    private String username;

    private String driveClassName;

    private StringValueResolver resolver;

    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        this.resolver = resolver;
        this.driveClassName = this.resolver.resolveStringValue("${db.driveClassName}");
    }

    @Bean
    public DataSource dataSourceTest(@Value("${db.password}") String password) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(username);
        dataSource.setPassword(password);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setDriverClass(driveClassName);
        return dataSource;
    }

    @Bean
    public DataSource dataSourceDev(@Value("${db.password}") String password) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(username);
        dataSource.setPassword(password);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/mysql");
        dataSource.setDriverClass(driveClassName);
        return dataSource;
    }

    @Bean
    public DataSource dataSourceProd(@Value("${db.password}") String password) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(username);
        dataSource.setPassword(password);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/qm_dmp");
        dataSource.setDriverClass(driveClassName);
        return dataSource;
    }
}
