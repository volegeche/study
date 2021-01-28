package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AopLog {

    @Pointcut("execution(* aop.TestService..*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void before(JoinPoint joinPoint){
        System.out.println("before--------"+joinPoint.getArgs());
    }

    @After("pointCut()")
    public void after(JoinPoint joinPoint){
        System.out.println("after--------"+joinPoint.getArgs());
    }

    @AfterReturning("pointCut()")
    public void AfterReturning(JoinPoint joinPoint){
        System.out.println("AfterReturning--------"+joinPoint.getArgs());
    }

    @AfterThrowing(value = "pointCut()",throwing="e")
    public void AfterThrowing(JoinPoint joinPoint,Exception e){
        System.out.println("AfterThrowing--------"+e);
    }
}
