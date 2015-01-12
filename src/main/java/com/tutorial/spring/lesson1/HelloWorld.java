/**
 * 
 */
package com.tutorial.spring.lesson1;

/**
 * @author  Jimmy  </br>
 * 创建时间： 2014年12月31日 下午2:03:28. </br>
 * 功能描述:  . </br>
 * 修  改  人：    . </br>  
 * 修改时间：   . </br>
 * 修改备注：
 */
public class HelloWorld {
	private String name;
	
	public void sayHello(){
		System.out.println("Hello "+name);
	}

	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
}
