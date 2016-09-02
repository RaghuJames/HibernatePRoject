package com.tm.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ETH_MA_USER1")
public class Cost implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_ids")
	private Integer userId;
	
	@Id
	@Column(name="user_names")
	private String userName;
	
	@Column(name="user_address1")
	private String address1;
	
	@Column(name="user_address2")
	private String address2;
	
	@Column(name="user_amount")
	private Double amount;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
}
