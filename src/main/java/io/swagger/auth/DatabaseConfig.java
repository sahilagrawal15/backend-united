package io.swagger.auth;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    @Bean
    public DataSource dataSource() {
        // Configure your DataSource here (using DataSourceBuilder or any other method)
        return DataSourceBuilder.create()
                .url("jdbc:mysql://localhost:3306/cargodb")
                .username("root")
                .password("rootroot")
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .build();
    }

//    @Bean
//    public DataSourceInitializer dataSourceInitializer(DataSource dataSource) {
//        DataSourceInitializer initializer = new DataSourceInitializer();
//        initializer.setDataSource(dataSource);
//        initializer.setDatabasePopulator(databasePopulator());
//        return initializer;
//    }
//
//    private ResourceDatabasePopulator databasePopulator() {
//        ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
//        populator.addScript(new ClassPathResource("united_airlines_ramp.sql")); // Path to your SQL script
//        // Add more scripts if needed
//        return populator;
//    }
}

