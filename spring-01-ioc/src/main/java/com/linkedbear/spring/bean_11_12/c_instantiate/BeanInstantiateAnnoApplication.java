package com.linkedbear.spring.bean_11_12.c_instantiate;

import com.linkedbear.spring.bean_11_12.c_instantiate.config.BeanInstantiateConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanInstantiateAnnoApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanInstantiateConfiguration.class);
    }

}
