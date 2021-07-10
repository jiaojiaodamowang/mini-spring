package minispring;

import minispring.bean.UserService;
import minispring.beans.factory.config.BeanDefinition;
import minispring.beans.factory.support.DefaultListableBeanFactory;
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
        UserService userService1 = (UserService) beanFactory.getBean("userService", "newbie");
        userService1.query();
        UserService userService2 = (UserService) beanFactory.getBean("userService", "newbie");
        userService2.query();
        System.out.println("userService1 == userService2 ? : " + (userService1 == userService2));
    }
}
