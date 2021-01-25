package create;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * TestObject 与 TestObject2 与TestObject3 的创建方式效果是一样的
 * @Bean(initMethod = "init",destroyMethod = "destroy") 与 @PostConstruct/@PreDestroy 与InitializingBean, DisposableBean接口不会同时生效
 *
 */
public class CreateBeanApplication {
    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CreateBeanConfig.class);
        System.out.println("spring context 创建完成！");
        ((AnnotationConfigApplicationContext) applicationContext).close();
    }
}
