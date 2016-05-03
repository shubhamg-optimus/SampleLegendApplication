package com.spring.legend.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="OrganizationContactInfo")
public class OrganizationContactInfo {
	
	private int id;
	private Organization organization;
	private User contactName;
	private User salesPerson;
	private String siteName;
	
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
	@OneToOne
	@PrimaryKeyJoinColumn
	public User getContactName() {
		return contactName;
	}
	public void setContactName(User contactName) {
		this.contactName = contactName;
	}
	@OneToOne
	@PrimaryKeyJoinColumn
	public User getSalesPerson() {
		return salesPerson;
	}
	public void setSalesPerson(User salesPerson) {
		this.salesPerson = salesPerson;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
}
