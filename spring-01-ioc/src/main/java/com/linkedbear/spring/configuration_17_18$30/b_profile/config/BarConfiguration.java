package com.linkedbear.spring.configuration_17_18$30.b_profile.config;

import com.linkedbear.spring.configuration_17_18$30.b_profile.component.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {

    @Bean
    public Bar bbbar() {
        return new Bar();
    }
}
