package com.project.user.dto;

public class wishlist {
	
int buyerid;
int prodid;
@Override
public String toString() {
	return "wishlist [buyerid=" + buyerid + ", prodid=" + prodid + "]";
}
public int getBuyerid() {
	return buyerid;
}
public void setBuyerid(int buyerid) {
	this.buyerid = buyerid;
}
public int getProdid() {
	return prodid;
}
public void setProdid(int prodid) {
	this.prodid = prodid;
}
}
