package com.linkedbear.spring.annotation_07$19$21.h_propertyxml;

import com.linkedbear.spring.annotation_07$19$21.h_propertyxml.bean.JdbcXmlProperty;
import com.linkedbear.spring.annotation_07$19$21.h_propertyxml.config.JdbcXmlConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertySourceXmlApplication {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcXmlConfiguration.class);
        System.out.println(ctx.getBean(JdbcXmlProperty.class).toString());
    }
}
