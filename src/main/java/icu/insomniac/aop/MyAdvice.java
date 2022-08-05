package icu.insomniac.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
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
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            System.out.print((i+1)+": ");
            pjp.proceed();
        }
        Long end = System.currentTimeMillis();
        Signature signature = pjp.getSignature();
        System.out.println(signature.getDeclaringTypeName()+"\n"+signature.getName());
        System.out.println("Time to execute 100 times: "+(end-start)+" ms");
    }
}
