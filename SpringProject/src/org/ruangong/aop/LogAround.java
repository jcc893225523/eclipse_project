package org.ruangong.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAround implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		 	Object result = null;
		try{
		 		
		 		System.out.println("�û���֪ͨʵ�ֵ�ǰ��֪ͨ");
		 		//invocation.proceed()֮ǰ�Ĵ��룺ǰ��֪ͨ
		 		result = invocation.proceed();
		 		//invocation.proceed()֮��Ĵ���;����֪ͨ
		 		System.out.println("�û���֪ͨʵ�ֵĺ���֪ͨ");

		 	}catch(Exception e){
		 		System.out.println("�û���֪ͨʵ�ֵ��쳣֪ͨ");
		 	}
		return result;
	}

}
