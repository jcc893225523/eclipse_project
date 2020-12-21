package org.ruangong.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component("logAnnotation")
@Aspect  //声明该类是一个通知
public class LogAspectAnnotation {
	
	
	//声明该方法是前置通知
//	@Before("execution(public void org.ruangong.service.impl.StudentServiceImpl.addStudent(org.ruangong.entity.Student))")
//	public void myBefore(){
//		System.out.println("《注解实现前置通知...》");
//	}
//	//声明该方法是后置通知
//	@AfterReturning("execution(public void org.ruangong.service.impl.StudentServiceImpl.addStudent(org.ruangong.entity.Student))")
//	public void myAfter(){
//		System.out.println("《注解实现后置通知...》");
//	}
	@Before("execution(public void org.ruangong.service.impl.StudentServiceImpl.addStudent(org.ruangong.entity.Student))")
	public void myBefore(JoinPoint jp){
		System.out.println("《注解实现前置通知...》:目标对象："+jp.getTarget()+"，方法名："+jp.getSignature().getName()+"，参数列表："+Arrays.toString(jp.getArgs()));
	}
	@AfterReturning(pointcut="execution(public void org.ruangong.service.impl.StudentServiceImpl.addStudent(org.ruangong.entity.Student))",returning="returningValue")
	public void myAfter(JoinPoint jp,Object returningValue){
		System.out.println("《注解实现后置通知...》:目标对象："+jp.getTarget()+"，方法名："+jp.getSignature().getName()+"，参数列表："+Arrays.toString(jp.getArgs())+"，返回值："+returningValue);
	}
	//@Around环绕通知
	@Around("execution(public void org.ruangong.service.impl.StudentServiceImpl.addStudent(org.ruangong.entity.Student))")
	public void myAround(ProceedingJoinPoint jp){
		System.out.println("《环绕注解实现的前置通知...》");
		try{
			
			jp.proceed();//执行方法。
			System.out.println("《环绕注解实现的后置通知...》");

		}catch(Throwable e){
			System.out.println("《环绕注解实现的异常通知...》");

		}finally{
			//无论发生不发生异常都会执行
			System.out.println("《环绕注解实现的最终通知...》");

		}
	}
	//@AfterThrowing异常通知
}
