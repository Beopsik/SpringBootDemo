package me.whiteship.springapplicationcontext;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerfAspect {

    @Around("@annotation(PerfLogging)")
    public Object logPerf(ProceedingJoinPoint pjp) throws  Throwable{
        long begin=System.currentTimeMillis();
        Object retVal=pjp.proceed();
        System.out.println(System.currentTimeMillis()-begin);
        return  retVal;
    }

    @Before("@annotation(PerfLogging)")
    public void check(){
        System.out.println("Check Performance");
    }
}
