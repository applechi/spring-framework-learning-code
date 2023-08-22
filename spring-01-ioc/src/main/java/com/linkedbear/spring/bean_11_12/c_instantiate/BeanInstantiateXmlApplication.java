package com.linkedbear.spring.bean_11_12.c_instantiate;

import com.linkedbear.spring.bean_11_12.c_instantiate.bean.Car;
import com.linkedbear.spring.bean_11_12.c_instantiate.bean.CarInstanceFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInstantiateXmlApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean/bean-instantiate.xml");
        ctx.getBeansOfType(Car.class).forEach((beanName, car) -> {
            System.out.println(beanName + " : " + car);
        });
        System.out.println(ctx.getBean(CarInstanceFactory.class));
    }
}
