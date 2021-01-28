package aop;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 */
public class AopApplication {

    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
        applicationContext.getBean(TestService.class).division(1,2);
        applicationContext.getBean(TestService.class).division(1,0);
        //System.out.println(applicationContext.getBean(InjectService.class));
    }
}
