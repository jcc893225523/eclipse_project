package org.ruangong.aop;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class LogExecption implements ThrowsAdvice{
	public void afterThrowing(Method method,Object[] args,Object target,Throwable ex)
	{
		System.out.println("异常通知：目标对象："+target+",方法名："+method.getName()+",方法的参数："+args.length+",异常类型："+ex.getMessage());
	}
}
