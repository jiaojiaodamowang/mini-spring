package com.kiddz.minispring.beans.factory.support;

import com.kiddz.minispring.BeansException;
import com.kiddz.minispring.beans.factory.config.BeanDefinition;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    @Override
    public Object createBean(String name, BeanDefinition beanDefinition) {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("fail to instantiate bean", e);
        }
        addSingleton(name, bean);
        return bean;
    }
}
