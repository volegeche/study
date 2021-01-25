package create;

import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * processor 概念
 * 针对于spring注解,操作等 标记（标识）的处理器，对这部分特殊增强操作
 *
 * 此处可理解为对于spring管理对象的创建初始化时的增强， aop的before/after
 */
public class CreateBeanProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName){
        System.out.println(beanName+"postProcessBeforeInitialization");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName){
        System.out.println(beanName+"postProcessAfterInitialization");
        return bean;
    }
}
