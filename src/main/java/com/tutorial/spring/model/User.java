/**
 * 
 */
package com.tutorial.spring.model;

import java.io.Serializable;

/**
 * @author  Jimmy  </br>
 * ����ʱ�䣺 2014��12��31�� ����3:42:46. </br>
 * ��������:  . </br>
 * ��  ��  �ˣ�    . </br>  
 * �޸�ʱ�䣺   . </br>
 * �޸ı�ע��
 */
public class User implements Serializable{

	private static final long serialVersionUID = 1075793661604185052L;
	
	private Long 	id;
	private String  name;
	private Integer age;
	private String  address;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age
				+ ", address=" + address + "]";
	}
	
}
