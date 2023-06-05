package com.implementation.businessLogic;
import com.implementation.implementationOfBusinessLogics.JDBCConnection;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
public class ScopeLearn {

    @Autowired
    JDBCConnection jdbcConnection;

    public JDBCConnection getJdbcConnection() {
        return jdbcConnection;
    }

    @PostConstruct
    public void m1() {
        System.out.println("Post Construct");
    }
    @PreDestroy
    public void m2() {
        System.out.println("PreDestroy");
    }


}
