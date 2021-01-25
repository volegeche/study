package base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlApplication {

    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name : names){
            System.out.println(name);
            System.out.println(applicationContext.getBean(name));
        }
    }
}
