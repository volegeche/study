package base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigApplication {

    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigBean.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name : names){
            System.out.println(name);
            System.out.println(applicationContext.getBean(name));
        }
    }
}
