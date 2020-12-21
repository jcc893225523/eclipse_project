package org.ruangong.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogSchema {

	public void afterReturning(JoinPoint jp,Object returnValue) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("(Schema)后置通知....目标对象："+jp.getThis()+"，调用的方法："+jp.getSignature().getName()+"，方法的参数的个数："+jp.getArgs().length+"，返回值："+returnValue);
	}
	
	public void before(){
		System.out.println("(Schema)前置通知...");
	}
	public void whenException(JoinPoint jp,NullPointerException e){
		System.out.println("(Schema)异常通知..."+e.getMessage());
	}
	public Object around(ProceedingJoinPoint jp){
		System.out.println("(Scheam)环绕通知：前置通知。。。。。。");
		Object result = null;
		try{
		 result = jp.proceed();
		System.out.println("(Scheam)环绕通知：后置通知。。。。。。");
		}catch(Throwable e){
		System.out.println("(Scheam)环绕通知：异常通知。。。。。。");
		}
		return result;
	}
}
