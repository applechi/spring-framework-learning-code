package apple.test.postprocessor;

import apple.test.postprocessor.bean.HelloService;
import apple.test.postprocessor.bean.WorldService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor.postProcessBeforeInitialization: " + beanName);
        // 如果返回非空对象，则使用返回的对象作为初始化结果
        if (beanName.equals("helloService")) {
            return new HelloService("Modified by postProcessBeforeInitialization");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor.postProcessAfterInitialization: " + beanName);
        // 如果返回非空对象，则使用返回的对象作为最终结果
        if (beanName.equals("worldService")) {
            return new WorldService("Modified by postProcessAfterInitialization");
        }
        return bean;
    }
}
