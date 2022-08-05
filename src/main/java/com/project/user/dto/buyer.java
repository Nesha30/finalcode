package com.project.user.dto;





public class buyer {

	int buyerid;
	String name;
	String email;
	Long phonenumber;
	String password;
	@Override
	public String toString() {
		return "buyer [buyerid=" + buyerid + ", name=" + name + ", email=" + email + ", phonenumber=" + phonenumber
				+ ", password=" + password + ", isprivileged=" + isprivileged + ", rewarpoints=" + rewarpoints
				+ ", isactive=" + isactive + "]";
	}
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
	Boolean isprivileged;
	int rewarpoints;
	Boolean isactive;

}
