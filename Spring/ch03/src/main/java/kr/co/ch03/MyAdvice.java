package kr.co.ch03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAdvice {

    @Pointcut("execution(void kr.co.ch03.MyService.insert())")
    public void insertPointCut(){}

    @Pointcut("execution(void kr.co.ch03.MyService.select*(..))")
    public void selectPointcut(){}


    @Before("insertPointCut() || selectPointcut()")
    public void beforeAdvice(){
        System.out.println("부가기능 - beforeAdvice");
    }

    @After("insertPointCut() || selectPointcut()")
    public void afterAdvice(){
        System.out.println("부가기능 - afterAdvice");
    }

    @AfterReturning("insertPointCut()")
    public void afterReturnAdvice(){
        System.out.println("부가기능 - afterReturnAdvice");
    }

    @Around("insertPointCut()")
    public void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("부가기능 - aroundAdvice(1)");
        pjp.proceed();
        System.out.println("부가기능 - aroundAdvice(1)");
    }

    @AfterThrowing("selectPointcut()")
    public void afterThrowAdvice(){
        System.out.println("부가기능 - afterThrowAdvice");
    }


}
