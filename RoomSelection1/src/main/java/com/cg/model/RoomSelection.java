package com.cg.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="room details")
public class RoomSelection {
        @Id
	     private int rno;
	     private String rname;
	     private String rtype;
	     private double rprice;
	     private int noofrooms;
		public RoomSelection() {
			super();
			// TODO Auto-generated constructor stub
		}
		public RoomSelection(int rno, String rname, String rtype, double rprice, int noofrooms) {
			super();
			this.rno = rno;
			this.rname = rname;
			this.rtype = rtype;
			this.rprice = rprice;
			this.noofrooms = noofrooms;
		}
		public int getRno() {
			return rno;
		}
		public void setRno(int rno) {
			this.rno = rno;
		}
		public String getRname() {
			return rname;
		}
		public void setRname(String rname) {
			this.rname = rname;
		}
		public String getRtype() {
			return rtype;
		}
		public void setRtype(String rtype) {
			this.rtype = rtype;
		}
		public double getRprice() {
			return rprice;
		}
		public void setRprice(double rprice) {
			this.rprice = rprice;
		}
		public int getNoofrooms() {
			return noofrooms;
		}
		public void setNoofrooms(int noofrooms) {
			this.noofrooms = noofrooms;
		}
		@Override
		public String toString() {
			return "RoomSelection [rno=" + rno + ", rname=" + rname + ", rtype=" + rtype + ", rprice=" + rprice
					+ ", noofrooms=" + noofrooms + "]";
		} 
}
