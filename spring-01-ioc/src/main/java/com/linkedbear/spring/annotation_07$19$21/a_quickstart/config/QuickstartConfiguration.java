package com.linkedbear.spring.annotation_07$19$21.a_quickstart.config;

import com.linkedbear.spring.annotation_07$19$21.a_quickstart.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuickstartConfiguration {

    @Bean
    public Person person() {
        return new Person();
    }

}
