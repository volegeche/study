package proxy;

import proxy.cglib.CglibService;
import proxy.cglib.CglibServiceInterceptor;
import proxy.jdk.JdkService;
import proxy.jdk.JdkServiceProxyHandle;
import proxy.jdk.Service;

import java.util.Arrays;

public class TestMain {

    public static void main(String[] args){
        JdkServiceProxyHandle proxy = new JdkServiceProxyHandle();
        Service service = (Service) proxy.bind(new JdkService());
        service.business();
        CglibService cglibService = new CglibService();
        CglibServiceInterceptor cglibServiceInterceptor = new CglibServiceInterceptor();
        CglibService cglibServiceProxy = (CglibService) cglibServiceInterceptor.bind(cglibService);
        cglibServiceProxy.business();

    }
}
