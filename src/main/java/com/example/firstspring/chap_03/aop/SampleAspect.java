package com.example.firstspring.chap_03.aop;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Aspect
@Component
public class SampleAspect {
    @Before("execution(* com.example.firstspring.chap_03.used.*Greet.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
//        시작 부분 표시
        System.out.println("=======Before Advice=======");
//        날짜를 출력
        System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(new java.util.Date()));
//        메소드 이름 출력
        System.out.println(String.format("메소드:%s", joinPoint.getSignature().getName()));
    }
}
