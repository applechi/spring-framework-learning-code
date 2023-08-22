package com.linkedbear.spring.annotation_07$19$21.g_propertysource;

import com.linkedbear.spring.annotation_07$19$21.g_propertysource.bean.JdbcProperties;
import com.linkedbear.spring.annotation_07$19$21.g_propertysource.config.JdbcPropertiesConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertySourcePropertiesApplication {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                JdbcPropertiesConfiguration.class);
        System.out.println(ctx.getBean(JdbcProperties.class).toString());
    }
}
