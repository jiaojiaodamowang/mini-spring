package minispring;

import minispring.bean.UserDao;
import minispring.bean.UserService;
import minispring.beans.PropertyValue;
import minispring.beans.PropertyValues;
import minispring.beans.factory.config.BeanDefinition;
import minispring.beans.factory.config.BeanReference;
import minispring.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

public class Mock {

    @Test
    public void test() {
        // init BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // register BeanDefinition
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));
        beanFactory.registerBeanDefinition("userService", new BeanDefinition(UserService.class, propertyValues));

        // get Bean
        UserService userService1 = (UserService) beanFactory.getBean("userService");
        userService1.query("Tony Stark");
    }
}
