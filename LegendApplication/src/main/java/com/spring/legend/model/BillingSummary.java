package com.spring.legend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BillingSummary")
public class BillingSummary {
	
	private int id;
	private String month;
	private int kWH;
	private int kW;
	private int cost;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getkWH() {
		return kWH;
	}
	public void setkWH(int kWH) {
		this.kWH = kWH;
	}
	public int getkW() {
		return kW;
	}
	public void setkW(int kW) {
		this.kW = kW;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}

}
