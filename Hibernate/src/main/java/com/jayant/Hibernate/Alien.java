package com.jayant.Hibernate;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Table(name="alien_table")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Alien {
	@Id
	private int aid;
//	private AlienName aname;
	private String color;
	private String aname;
//	@ManyToMany(mappedBy="alien")
//	private Collection<Laptop> laps = new ArrayList<Laptop>();
	
	
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
//	public Collection<Laptop> getLaps() {
//		return laps;
//	}
//	public void setLaps(Collection<Laptop> laps) {
//		this.laps = laps;
//	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", color=" + color + ", aname=" + aname + "]";
	}
	
	
	
	
//	public AlienName getAname() {
//		return aname;
//	}
//	public void setAname(AlienName aname) {
//		this.aname = aname;
//	}
//	public String getColor() {
//		return color;
//	}
//	public void setColor(String color) {
//		this.color = color;
//	}
	
	
	
}
