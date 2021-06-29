package com.kiddz.minispring.beans.factory;

import com.kiddz.minispring.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;
}
