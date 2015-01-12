/**
 * 
 */
package com.tutorial.spring.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author  Jimmy  </br>
 * ����ʱ�䣺 2014��12��31�� ����3:13:35. </br>
 * ��������:  . </br>
 * ��  ��  �ˣ�    . </br>  
 * �޸�ʱ�䣺   . </br>
 * �޸ı�ע��
 */
public class Book implements Serializable{
	private static final long serialVersionUID = -4070263150506343691L;
	
	private Long 	id;
	private String  name;
	private Short	price;
	private Date    releaseDate;
	
	private User    user;//�������

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
	 * @return the price
	 */
	public Short getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Short price) {
		this.price = price;
	}

	/**
	 * @return the releaseDate
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}

	/**
	 * @param releaseDate the releaseDate to set
	 */
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price
				+ ", releaseDate=" + releaseDate + ", user=" + user + "]";
	}

	
}
