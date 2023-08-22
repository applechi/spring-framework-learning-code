package com.linkedbear.spring.annotation_07$19$21.d_importxml.config;

import com.linkedbear.spring.basic_dl_04_06.a_quickstart_byname.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfigConfiguration {

    @Bean
    public Person person() {
        return new Person();
    }

}
