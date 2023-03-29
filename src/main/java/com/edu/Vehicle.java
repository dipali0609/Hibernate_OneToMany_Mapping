package com.edu;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private int Vid;
  private String Vname;
  
  
  
public Vehicle() {
	super();
	// TODO Auto-generated constructor stub
}
public Vehicle(int vid, String vname) {
	super();
	this.Vid = vid;
	this.Vname = vname;
}
public int getVid() {
	return Vid;
}
public void setVid(int Vid) {
	this.Vid = Vid;
}
public String getVname() {
	return Vname;
}
public void setVname(String Vname) {
	this.Vname = Vname;
}
@Override
public String toString() {
	return "Vehicle [Vid=" + Vid + ", Vname=" + Vname + "]";
}
  

}
