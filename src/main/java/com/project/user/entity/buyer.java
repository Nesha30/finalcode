package com.project.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "buyer")
public class buyer {


	
	public int getBuyerid() {
		return buyerid;
	}
	public void setBuyerid(int buyerid) {
		this.buyerid = buyerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getIsprivileged() {
		return isprivileged;
	}
	public void setIsprivileged(Boolean isprivileged) {
		this.isprivileged = isprivileged;
	}
	public int getRewarpoints() {
		return rewarpoints;
	}
	public void setRewarpoints(int rewarpoints) {
		this.rewarpoints = rewarpoints;
	}
	public Boolean getIsactive() {
		return isactive;
	}
	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}
	@Id
	@GeneratedValue
	int buyerid;
	@Column(nullable = false)
	String name;
	@Column(nullable = false)
	String email;
	@Column(nullable = false)
	Long phonenumber;
	@Column(nullable = false)
	String password;
	@Column(nullable = false)
	Boolean isprivileged;
	@Column(nullable = false)
	int rewarpoints;
	@Column(nullable = false)
	Boolean isactive;

}
