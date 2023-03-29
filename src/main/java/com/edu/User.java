package com.edu;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.JoinColumnOrFormula;

@Entity
public class User
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int userid;
    private String username;
    
    @OneToMany
 //  @JoinTable(name="uservehicle",joinColumns=@JoinColumn(name="userID"), inverseJoinColumns=@JoinColumn(name="vehicleid"))
    List<Vehicle> vehicle=new ArrayList<Vehicle>();
	public List<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
	
  
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userid, String username) {
		super();
		this.userid = userid;
		this.username = username;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + "]";
	}
    
}
