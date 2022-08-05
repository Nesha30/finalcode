package com.project.user.dto;

public class seller {
 int sellerid;
 String name;
 String email;
 Long phonenumber;
 String password;
 Boolean isactive;
@Override
public String toString() {
	return "seller [sellerid=" + sellerid + ", name=" + name + ", email=" + email + ", phonenumber=" + phonenumber
			+ ", password=" + password + ", isactive=" + isactive + "]";
}
public int getSellerid() {
	return sellerid;
}
public void setSellerid(int sellerid) {
	this.sellerid = sellerid;
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
public Boolean getIsactive() {
	return isactive;
}
public void setIsactive(Boolean isactive) {
	this.isactive = isactive;
}
}
