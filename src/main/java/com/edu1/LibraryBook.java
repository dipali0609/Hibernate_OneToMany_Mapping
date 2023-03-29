package com.edu1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LibraryBook 
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int boookid;
private String bookname;
public LibraryBook() {
	super();
	// TODO Auto-generated constructor stub
}
public LibraryBook(int boookid, String bookname) {
	super();
	this.boookid = boookid;
	this.bookname = bookname;
}
public int getBoookid() {
	return boookid;
}
public void setBoookid(int boookid) {
	this.boookid = boookid;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
@Override
public String toString() {
	return "LibraryBook [boookid=" + boookid + ", bookname=" + bookname + "]";
}


}
