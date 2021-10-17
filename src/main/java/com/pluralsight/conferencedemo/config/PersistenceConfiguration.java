//Customise and create changes or configuration in the Persistence tier
package com.pluralsight.conferencedemo.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceConfiguration {

//    @Bean
//    public DataSource dataSource() {
//        DataSourceBuilder builder = DataSourceBuilder.create();
//        builder.url("jdbc:postgresql://localhost:5432/conference_app");
//        System.out.println("My custom datasource bean has been initialised and set");
//        return builder.build();
//    }
}
