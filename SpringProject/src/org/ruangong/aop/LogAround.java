package org.ruangong.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAround implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		 	Object result = null;
		try{
		 		
		 		System.out.println("用环绕通知实现的前置通知");
		 		//invocation.proceed()之前的代码：前置通知
		 		result = invocation.proceed();
		 		//invocation.proceed()之后的代码;后置通知
		 		System.out.println("用环绕通知实现的后置通知");

		 	}catch(Exception e){
		 		System.out.println("用环绕通知实现的异常通知");
		 	}
		return result;
	}

}
