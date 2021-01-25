package ioc.register;


import base.entity.Cat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * spring注册对象方式：
 * 1.常用扫描 声明方式@Bean 与基于@Component的注解 或xml<bean></bean>
 * 2.引入ImportSelector选定类注册
 * 3.引入ImportBeanDefinitionRegister 创建RootBeanDefinition实例注册类对象
 * 特殊例子，包装FactoryBean再经过1注册. 以上2、3均为默认单例模式
 */
public class RegisterApplication {

    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RegisterConfig.class);
        System.out.println("spring context 创建完成！");
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name : names){
            System.out.println(name);
        }
        System.out.println(applicationContext.getBean(Cat.class));
    }
}
