package com.kshrd.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
@MapperScan("com.kshrd")
public class DatabaseConfiguration {
//    @Bean
//    @Profile("postgres")
//    public DataSource production(){
//        DriverManagerDataSource db =new DriverManagerDataSource();
//        db.setDriverClassName("org.postgresql.Driver");
//        db.setUrl("jdbc:postgresql://localhost:5432/ams");
//        db.setUsername("postgres");
//        db.setPassword("1234");
//        return  db;
//    }
    @Bean
//    @Profile("h2")
    public DataSource development(){
        EmbeddedDatabaseBuilder db =new EmbeddedDatabaseBuilder();
        db.setType(EmbeddedDatabaseType.H2);
        db.addScript("sql/table.sql");
        return  db.build();
    }
}