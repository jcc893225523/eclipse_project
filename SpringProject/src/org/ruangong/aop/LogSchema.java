package org.ruangong.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogSchema {

	public void afterReturning(JoinPoint jp,Object returnValue) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("(Schema)����֪ͨ....Ŀ�����"+jp.getThis()+"�����õķ�����"+jp.getSignature().getName()+"�������Ĳ����ĸ�����"+jp.getArgs().length+"������ֵ��"+returnValue);
	}
	
	public void before(){
		System.out.println("(Schema)ǰ��֪ͨ...");
	}
	public void whenException(JoinPoint jp,NullPointerException e){
		System.out.println("(Schema)�쳣֪ͨ..."+e.getMessage());
	}
	public Object around(ProceedingJoinPoint jp){
		System.out.println("(Scheam)����֪ͨ��ǰ��֪ͨ������������");
		Object result = null;
		try{
		 result = jp.proceed();
		System.out.println("(Scheam)����֪ͨ������֪ͨ������������");
		}catch(Throwable e){
		System.out.println("(Scheam)����֪ͨ���쳣֪ͨ������������");
		}
		return result;
	}
}
