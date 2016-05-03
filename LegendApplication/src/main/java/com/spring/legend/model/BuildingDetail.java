package com.spring.legend.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="BuildingDetail")
public class BuildingDetail {
	
	private int id;
	private Organization organization;
	private String type;
	private String primaryLightningTech;
	private int plugLevelVolt;
	private int efficiencyLevel;
	private int voltageFeed;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@ManyToOne(cascade=CascadeType.ALL) 
	public Organization getOrganization() {
		return organization;
	}
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrimaryLightningTech() {
		return primaryLightningTech;
	}
	public void setPrimaryLightningTech(String primaryLightningTech) {
		this.primaryLightningTech = primaryLightningTech;
	}
	public int getPlugLevelVolt() {
		return plugLevelVolt;
	}
	public void setPlugLevelVolt(int plugLevelVolt) {
		this.plugLevelVolt = plugLevelVolt;
	}
	public int getEfficiencyLevel() {
		return efficiencyLevel;
	}
	public void setEfficiencyLevel(int efficiencyLevel) {
		this.efficiencyLevel = efficiencyLevel;
	}
	public int getVoltageFeed() {
		return voltageFeed;
	}
	public void setVoltageFeed(int voltageFeed) {
		this.voltageFeed = voltageFeed;
	}
	
    
}
