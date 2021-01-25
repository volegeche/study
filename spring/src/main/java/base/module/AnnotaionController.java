package base.module;

import base.entity.Monkey;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class AnnotaionController {

    @Bean
    public Monkey testMonkey(){
        return new Monkey();
    }
}
