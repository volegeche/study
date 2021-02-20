package ioc.processor;

import ioc.inject.demo.InjectService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

//基于Component注解方式
@Import({TestBeanDefinitionRegistryPostProcessor.class,TestBeanFactoryPostProcessor.class})
public class ProcessorConfig {

}
