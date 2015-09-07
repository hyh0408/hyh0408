package net.daum.webtoon.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopAspect {
	
	@Pointcut("execution(* testAop(..))")
	public void test() {}
	
	@Before("test()")
	public void aopTest() {
		System.out.println("****  : before");
	}
}
