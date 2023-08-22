package com.linkedbear.spring.annotation_07$19$21.i_propertyyml;

import com.linkedbear.spring.annotation_07$19$21.i_propertyyml.bean.JdbcYmlProperty;
import com.linkedbear.spring.annotation_07$19$21.i_propertyyml.config.JdbcYmlConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertySourceYmlApplication {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcYmlConfiguration.class);
        System.out.println(ctx.getBean(JdbcYmlProperty.class).toString());
    }
}
