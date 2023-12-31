package com.linkedbear.spring.bean_11_12.b_scope.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // ConfigurableBeanFactory.SCOPE_SINGLETON
public class Toy {
    public Toy() {
        System.out.println("Toy constructor run ...");
    }
}
