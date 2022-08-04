package icu.insomniac.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* icu.insomniac.service.*Service.*())")
    private void fp(){}

    @Around("fp()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object proceed = null;
        for (int i = 0; i < 10; i++){
            System.out.print((i+1)+": ");
            proceed = pjp.proceed();
        }

        return proceed;
    }
}
