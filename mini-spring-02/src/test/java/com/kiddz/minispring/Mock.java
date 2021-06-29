package com.kiddz.minispring;

import com.kiddz.minispring.bean.UserService;
import com.kiddz.minispring.beans.factory.config.BeanDefinition;
import com.kiddz.minispring.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

public class Mock {

    @Test
    public void test() {
        // init BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // register BeanDefinition
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // get Bean
        UserService userService1 = (UserService) beanFactory.getBean("userService");
        userService1.query();
        UserService userService2 = (UserService) beanFactory.getBean("userService");
        userService2.query();
        System.out.println("userService1 == userService2 ? : " + (userService1 == userService2));
    }
}
