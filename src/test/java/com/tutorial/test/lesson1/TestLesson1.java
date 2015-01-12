/**
 * 
 */
package com.tutorial.test.lesson1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ApplicationContext 代表Ioc容器.
 * Ioc容器首先要初始化,然后才能获取容器中的Bean.
 * ClassPathXmlApplicationContext 是 ApplicationContext接口的实现类,从类路径下加载配置文件.
 */
import com.tutorial.spring.lesson1.HelloWorld;

/**
 * @author  Jimmy  </br>
 * 创建时间： 2014年12月31日 下午2:07:27. </br>
 * 功能描述:  . </br>
 * 修  改  人：    . </br>  
 * 修改时间：   . </br>
 * 修改备注：
 */
public class TestLesson1 {
	
	public static void main(String[] args) {
		/*传统调用*/
		//1 新建一个对象
		HelloWorld helloWorld = new HelloWorld();
		//2 为对象赋值
		helloWorld.setName("Jimmy");
		//3调用hello 方法
		helloWorld.sayHello();
//----------------------------------------------------------------------------------------------------		
		/*Spring调用     1、2两步交给Spring*/
		//1 创建Spring的Ioc容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContextLesson1.xml");
		//2 从Ioc容易获取Bean实例
		HelloWorld helloSpring = (HelloWorld)ctx.getBean("helloWorld");
		//3 调用hello方法
		helloSpring.sayHello();
	}

}
