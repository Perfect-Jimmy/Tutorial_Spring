/**
 * 
 */
package com.tutorial.test.lesson1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ApplicationContext ����Ioc����.
 * Ioc��������Ҫ��ʼ��,Ȼ����ܻ�ȡ�����е�Bean.
 * ClassPathXmlApplicationContext �� ApplicationContext�ӿڵ�ʵ����,����·���¼��������ļ�.
 */
import com.tutorial.spring.lesson1.HelloWorld;

/**
 * @author  Jimmy  </br>
 * ����ʱ�䣺 2014��12��31�� ����2:07:27. </br>
 * ��������:  . </br>
 * ��  ��  �ˣ�    . </br>  
 * �޸�ʱ�䣺   . </br>
 * �޸ı�ע��
 */
public class TestLesson1 {
	
	public static void main(String[] args) {
		/*��ͳ����*/
		//1 �½�һ������
		HelloWorld helloWorld = new HelloWorld();
		//2 Ϊ����ֵ
		helloWorld.setName("Jimmy");
		//3����hello ����
		helloWorld.sayHello();
//----------------------------------------------------------------------------------------------------		
		/*Spring����     1��2��������Spring*/
		//1 ����Spring��Ioc����
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContextLesson1.xml");
		//2 ��Ioc���׻�ȡBeanʵ��
		HelloWorld helloSpring = (HelloWorld)ctx.getBean("helloWorld");
		//3 ����hello����
		helloSpring.sayHello();
	}

}
