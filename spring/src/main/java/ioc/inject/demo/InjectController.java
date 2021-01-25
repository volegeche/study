package ioc.inject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class InjectController {
//    @Qualifier("injectService")
    @Autowired
    //@Resource()
    private InjectService injectService;

    public void sout(){
        System.out.println(injectService);
    }
}
