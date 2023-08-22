package com.linkedbear.spring.postprocessor_26.a_quickstart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanPostProcessorQuickstartApplication {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                "com.linkedbear.spring.postprocessor_26.a_quickstart");
        ctx.close();
    }
}
