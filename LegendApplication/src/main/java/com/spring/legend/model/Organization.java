package com.spring.legend.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Organization")
public class Organization {
	
	
	private int id;
	private String name;
	private String street;
	private String city;
	private String province;
	private int postalCode;
	private Set<OrganizationContactInfo> contactsInfo;
	private Set<BuildingDetail> buildingsDetail;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	@OneToMany(cascade=CascadeType.ALL, mappedBy="organization")  
	public Set<OrganizationContactInfo> getContactsInfo() {
		return contactsInfo;
	}
	public void setContactsInfo(Set<OrganizationContactInfo> contactsInfo) {
		this.contactsInfo = contactsInfo;
	}
	@OneToMany(cascade=CascadeType.ALL, mappedBy="organization")  
	public Set<BuildingDetail> getBuildingsDetail() {
		return buildingsDetail;
	}
	public void setBuildingsDetail(Set<BuildingDetail> buildingsDetail) {
		this.buildingsDetail = buildingsDetail;
	}

}
