package com.linkedbear.spring.annotation_07$19$21.a_quickstart;

import com.linkedbear.spring.annotation_07$19$21.a_quickstart.bean.Person;
import com.linkedbear.spring.annotation_07$19$21.a_quickstart.config.QuickstartConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(QuickstartConfiguration.class);
        Person person = ctx.getBean(Person.class);
        System.out.println(person);
    }
}
