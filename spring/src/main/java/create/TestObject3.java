package create;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TestObject3 implements InitializingBean, DisposableBean {

    public TestObject3(){
        System.out.println("TestObject3 constructor");
    }

    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        System.out.println("TestObject3 afterPropertiesSet method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("TestObject3 destroy method");
    }
}
