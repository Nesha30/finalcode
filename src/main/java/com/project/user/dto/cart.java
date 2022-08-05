package com.project.user.dto;

public class cart {
int buyerid;
int prodid;
int quantity;
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
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "cart [buyerid=" + buyerid + ", prodid=" + prodid + ", quantity=" + quantity + "]";
}

}
