/**
 * 
 */
package com.tutorial.spring.lesson1;

/**
 * @author  Jimmy  </br>
 * ����ʱ�䣺 2014��12��31�� ����2:03:28. </br>
 * ��������:  . </br>
 * ��  ��  �ˣ�    . </br>  
 * �޸�ʱ�䣺   . </br>
 * �޸ı�ע��
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
