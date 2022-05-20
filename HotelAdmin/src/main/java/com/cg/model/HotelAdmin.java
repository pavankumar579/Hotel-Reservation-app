package com.cg.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="Hotel")
public class HotelAdmin {
	@Id
     private int hid;
     private String hname;
     private int hfloors;
     private String hloc;
     //default constructor
	public HotelAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}
     //parameterized constructor
	public HotelAdmin(int hid, String hname, int hfloors, String hloc) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.hfloors = hfloors;
		this.hloc = hloc;
	}
	//gettes and setters method
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public int getHfloors() {
		return hfloors;
	}
	public void setHfloors(int hfloors) {
		this.hfloors = hfloors;
	}
	public String getHloc() {
		return hloc;
	}
	public void setHloc(String hloc) {
		this.hloc = hloc;
	}
	//to string method
	@Override
	public String toString() {
		return "HotelAdmin [hid=" + hid + ", hname=" + hname + ", hfloors=" + hfloors + ", hloc=" + hloc + "]";
	}
	
	
}
