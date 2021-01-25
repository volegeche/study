package base;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApplication {

    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigAnnotationScan.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name : names){
            System.out.println(name);
        }
    }
}
