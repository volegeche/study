package create;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TestObject2 {

    public TestObject2(){
        System.out.println("TestObject2 constructor");
    }

    @PostConstruct
    public void init(){
        System.out.println("TestObject2 init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("TestObject2 destroy method");
    }
}
