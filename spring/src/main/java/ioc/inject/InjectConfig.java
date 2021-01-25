package ioc.inject;

import ioc.inject.demo.InjectService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//基于Component注解方式
@ComponentScan(basePackages="ioc.inject.demo")
public class InjectConfig {

    @Bean("injectService2")
    public InjectService injectService(){
        InjectService injectService = new InjectService();
        injectService.setName("@Bean");
        return injectService;
    }
}
