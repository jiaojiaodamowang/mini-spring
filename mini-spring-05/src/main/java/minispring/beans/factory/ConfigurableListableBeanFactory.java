package minispring.beans.factory;

import minispring.beans.BeansException;
import minispring.beans.factory.config.AutowireCapableBeanFactory;
import minispring.beans.factory.config.BeanDefinition;
import minispring.beans.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
