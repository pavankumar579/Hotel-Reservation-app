package com.cg.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="location_details")
public class Location {
	@Id
	private int pincode;
     private String lname;
     private String Longitude;
     private String latitude;
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Location(int pincode, String lname, String longitude, String latitude) {
		super();
		this.pincode = pincode;
		this.lname = lname;
		Longitude = longitude;
		this.latitude = latitude;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLongitude() {
		return Longitude;
	}
	public void setLongitude(String longitude) {
		Longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	@Override
	public String toString() {
		return "Location [pincode=" + pincode + ", lname=" + lname + ", Longitude=" + Longitude + ", latitude="
				+ latitude + "]";
	}
     
}
