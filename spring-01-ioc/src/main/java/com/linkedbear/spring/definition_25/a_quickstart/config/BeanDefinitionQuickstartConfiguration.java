package com.linkedbear.spring.definition_25.a_quickstart.config;

import com.linkedbear.spring.definition_25.a_quickstart.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanDefinitionQuickstartConfiguration {

    @Bean
    public Person person() {
        return new Person();
    }
}
