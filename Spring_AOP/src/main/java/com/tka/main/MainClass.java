package com.tka.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tka.config.MyConfig;
import com.tka.entity.MobileRecharge;

public class MainClass {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
	MobileRecharge mr=context.getBean(MobileRecharge.class);
	mr.Recharge();
	context.close();
}
}
