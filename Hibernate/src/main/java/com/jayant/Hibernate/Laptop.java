package com.jayant.Hibernate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	private int lid;
	private String brand;
	private int price;
	@ManyToMany
	private Collection<Alien> alien = new ArrayList<Alien>();
//	private String lname;
//	@ManyToOne
//	@ManyToMany
//	private List<Student> student = new ArrayList<Student>();
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Collection<Alien> getAlien() {
		return alien;
	}
	public void setAlien(Collection<Alien> alien) {
		this.alien = alien;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + ", price=" + price + ", alien=" + alien + "]";
	}
	
	
	
	
//	public String getLname() {
//		return lname;
//	}
//	public void setLname(String lname) {
//		this.lname = lname;
//	}
	
	
//	public List<Student> getStudent() {
//		return student;
//	}
//	public void setStudent(List<Student> student) {
//		this.student = student;
//	}
//	@Override
//	public String toString() {
//		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
//	}
	
	
}
