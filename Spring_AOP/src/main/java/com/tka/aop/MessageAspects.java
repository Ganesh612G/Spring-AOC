package com.tka.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MessageAspects {
	@Before("execution (public void Recharge())")
	public void beforeMSG() {
		System.out.println("U R Rechareg is expiring Soon...");
	}
	
	@After("execution (public void Recharge())")
	public void afterMSG() {
		System.out.println("Enjoy U R Data Pack");
	}
	@Around("execution (* com.tka.entity.MobileRecharge.*())")
	public void aroundMSG(ProceedingJoinPoint pj) {
	
		try {
			pj.proceed();
			
		} catch (Throwable e) {
		}
		System.out.println("recharege done");
	}
	
	
	
}
