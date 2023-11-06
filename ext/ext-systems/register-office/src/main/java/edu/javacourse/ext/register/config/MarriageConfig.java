package edu.javacourse.ext.register.config;

import edu.javacourse.ext.register.dao.PersonDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = {"classpath:/register.properties"})
public class MarriageConfig {
    @Bean
    public PersonDao buildPersonDao(){
        System.out.println("PersonDao created");
        return new PersonDao();
    }
}
