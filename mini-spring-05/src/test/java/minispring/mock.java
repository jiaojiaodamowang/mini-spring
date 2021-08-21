package minispring;

import minispring.bean.UserService;
import minispring.beans.factory.support.DefaultListableBeanFactory;
import minispring.beans.factory.xml.XmlBeanDefinitionReader;
import org.junit.Test;

public class mock {

    @Test
    public void test() {
        // init BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // load config xml
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");

        // get bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.query();
    }
}
