package com.kiddz.minispring;

import com.kiddz.minispring.bean.UserService;
import org.junit.Test;

public class Mock {

    @Test
    public void test() {
        BeanFactory factory = new BeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        factory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) factory.getBean("userService");
        userService.query();
    }
}
