package aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@EnableAspectJAutoProxy
@Import(AopLog.class)
public class AopConfig {

    @Bean
    public TestService testService(){
        return new TestService();
    }
}
