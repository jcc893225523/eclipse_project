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
@Aspect  //����������һ��֪ͨ
public class LogAspectAnnotation {
	
	
	//�����÷�����ǰ��֪ͨ
//	@Before("execution(public void org.ruangong.service.impl.StudentServiceImpl.addStudent(org.ruangong.entity.Student))")
//	public void myBefore(){
//		System.out.println("��ע��ʵ��ǰ��֪ͨ...��");
//	}
//	//�����÷����Ǻ���֪ͨ
//	@AfterReturning("execution(public void org.ruangong.service.impl.StudentServiceImpl.addStudent(org.ruangong.entity.Student))")
//	public void myAfter(){
//		System.out.println("��ע��ʵ�ֺ���֪ͨ...��");
//	}
	@Before("execution(public void org.ruangong.service.impl.StudentServiceImpl.addStudent(org.ruangong.entity.Student))")
	public void myBefore(JoinPoint jp){
		System.out.println("��ע��ʵ��ǰ��֪ͨ...��:Ŀ�����"+jp.getTarget()+"����������"+jp.getSignature().getName()+"�������б�"+Arrays.toString(jp.getArgs()));
	}
	@AfterReturning(pointcut="execution(public void org.ruangong.service.impl.StudentServiceImpl.addStudent(org.ruangong.entity.Student))",returning="returningValue")
	public void myAfter(JoinPoint jp,Object returningValue){
		System.out.println("��ע��ʵ�ֺ���֪ͨ...��:Ŀ�����"+jp.getTarget()+"����������"+jp.getSignature().getName()+"�������б�"+Arrays.toString(jp.getArgs())+"������ֵ��"+returningValue);
	}
	//@Around����֪ͨ
	@Around("execution(public void org.ruangong.service.impl.StudentServiceImpl.addStudent(org.ruangong.entity.Student))")
	public void myAround(ProceedingJoinPoint jp){
		System.out.println("������ע��ʵ�ֵ�ǰ��֪ͨ...��");
		try{
			
			jp.proceed();//ִ�з�����
			System.out.println("������ע��ʵ�ֵĺ���֪ͨ...��");

		}catch(Throwable e){
			System.out.println("������ע��ʵ�ֵ��쳣֪ͨ...��");

		}finally{
			//���۷����������쳣����ִ��
			System.out.println("������ע��ʵ�ֵ�����֪ͨ...��");

		}
	}
	//@AfterThrowing�쳣֪ͨ
}
