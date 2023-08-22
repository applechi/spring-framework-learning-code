package apple.test.postprocessor;

import apple.test.postprocessor.bean.MyNewBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("MyBeanDefinitionRegistryPostProcessor.postProcessBeanDefinitionRegistry");
        // 创建一个新的 bean 定义
        BeanDefinition beanDefinition = new RootBeanDefinition(MyNewBean.class);
        // 注册到容器中
        registry.registerBeanDefinition("myNewBean", beanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanDefinitionRegistryPostProcessor.postProcessBeanFactory");
        // 修改已有的 bean 定义
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("helloService");
        beanDefinition.setScope(BeanDefinition.SCOPE_PROTOTYPE);
    }
}
