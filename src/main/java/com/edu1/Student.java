package com.edu1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.edu.Vehicle;

@Entity
@Table(name="StudentTable")
public class Student
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int studentid;
	@Column(name="Sname",length=50,unique=true,nullable=true)
private String studentname;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentid, String studentname) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
	}
	
	@OneToMany
	List<LibraryBook> list=new ArrayList<LibraryBook>();
	public List<LibraryBook> getList() {
		return list;
	}
	public void setList(List<LibraryBook> list) {
		this.list = list;
	}
	
	
	
	
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + "]";
	}
	
	


}
