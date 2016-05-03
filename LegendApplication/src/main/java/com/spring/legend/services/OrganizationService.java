package com.spring.legend.services;

import java.util.List;

import com.spring.legend.model.Organization;

public interface OrganizationService {
	
	public void addOrganization(Organization organization);
	public void updateOrganization(Organization organization);
	public void removeOrganization(int id);
	public Organization getOrganizationById(int id);
	public List<Organization> listOrganizations();

}
