package apple.test.postprocessor;

import apple.test.postprocessor.bean.MyNewBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("MyInstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation: " + beanName);
        // 如果返回非空对象，则跳过后续的实例化过程
        if (beanName.equals("myNewBean")) {
            return new MyNewBean("Created by postProcessBeforeInstantiation");
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("MyInstantiationAwareBeanPostProcessor.postProcessAfterInstantiation: " + beanName);
        // 如果返回 false，则跳过后续的属性注入过程
        if (beanName.equals("helloService")) {
            return false;
        }
        return true;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        System.out.println("MyInstantiationAwareBeanPostProcessor.postProcessPropertyValues: " + beanName);
        // 如果返回非空属性值，则使用返回的属性值进行注入
        if (beanName.equals("worldService")) {
            return new MutablePropertyValues().add("message", "Modified by postProcessPropertyValues");
        }
        return pvs;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyInstantiationAwareBeanPostProcessor.postProcessBeforeInitialization: " + beanName);
        // 如果返回非空对象，则使用返回的对象作为初始化结果
        if (beanName.equals("myNewBean")) {
            return new MyNewBean("Modified by postProcessBeforeInitialization");
        }
        return bean;
    }
}
