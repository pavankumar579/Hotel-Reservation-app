package com.cg.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="hotel_details")
public class HotelSelection {
	@Id
	private int hid;
     private String hname;
     private String hloc;
	public HotelSelection() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HotelSelection(int hid, String hname, String hloc) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.hloc = hloc;
	}
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
	public String getHloc() {
		return hloc;
	}
	public void setHloc(String hloc) {
		this.hloc = hloc;
	}
	@Override
	public String toString() {
		return "HotelSelection [hid=" + hid + ", hname=" + hname + ", hloc=" + hloc + "]";
	}
     
}
