/**
 * 
 */
package com.tutorial.test.lesson2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorial.spring.model.Book;

/**
 * @author  Jimmy  </br>
 * ����ʱ�䣺 2014��12��31�� ����3:46:46. </br>
 * ��������:  . </br>
 * ��  ��  �ˣ�    . </br>  
 * �޸�ʱ�䣺   . </br>
 * �޸ı�ע��
 */
public class TestLesson2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContextLesson2.xml");
		Book book = (Book)ctx.getBean("book");
		System.out.println(book);
	}

}
