package base;

import base.entity.Monkey;
import org.springframework.context.annotation.Bean;

public class ConfigBean {

    @Bean
    public Monkey monkey1(){
        Monkey monkey = new Monkey();
        monkey.setAge(1);
        monkey.setName("大叔");
        return monkey;
    }
}
