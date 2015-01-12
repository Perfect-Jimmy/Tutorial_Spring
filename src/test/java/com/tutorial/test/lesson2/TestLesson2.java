/**
 * 
 */
package com.tutorial.test.lesson2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorial.spring.model.Book;

/**
 * @author  Jimmy  </br>
 * 创建时间： 2014年12月31日 下午3:46:46. </br>
 * 功能描述:  . </br>
 * 修  改  人：    . </br>  
 * 修改时间：   . </br>
 * 修改备注：
 */
public class TestLesson2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContextLesson2.xml");
		Book book = (Book)ctx.getBean("book");
		System.out.println(book);
	}

}
