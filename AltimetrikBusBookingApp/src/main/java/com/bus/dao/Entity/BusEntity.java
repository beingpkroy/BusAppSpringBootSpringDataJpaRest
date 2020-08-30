package com.bus.dao.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="busdetails")
public class BusEntity {

	@Column(name="busname")
	private String busName;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="busnumber")
	private int busNumber;

	public BusEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusEntity(String busName, int busNumber) {
		super();
		this.busName = busName;
		this.busNumber = busNumber;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public int getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}

	@Override
	public String toString() {
		return "BusEntity [busName=" + busName + ", busNumber=" + busNumber
				+ "]";
	}
	
	
}
