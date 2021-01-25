package create;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TestObject 与 TestObject2 与TestObject3 的创建方式效果是一样的
 * @Bean(initMethod = "init",destroyMethod = "destroy") 与 @PostConstruct/@PreDestroy 与InitializingBean, DisposableBean接口不会同时生效
 *
 */
@Configuration
public class CreateBeanConfig {

    @Bean
    public CreateBeanProcessor createBeanProcessor(){
        return new CreateBeanProcessor();
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public TestObject testObject(){
        return new TestObject();
    }

    @Bean
    public TestObject2 testObject2(){
        return new TestObject2();
    }

    @Bean
    public TestObject3 testObject3(){
        return new TestObject3();
    }

}
