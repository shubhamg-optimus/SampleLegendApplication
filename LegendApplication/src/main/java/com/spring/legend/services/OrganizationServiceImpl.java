package com.spring.legend.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.spring.legend.dao.OrganizationDao;
import com.spring.legend.model.Organization;

@Service("OrganizationService")
public class OrganizationServiceImpl implements OrganizationService{
    
    private OrganizationDao organizationDao;
    
    public void setOrganizationDao(OrganizationDao organizationDao) {
		this.organizationDao = organizationDao;
	}
	
	@Transactional
	public void addOrganization(Organization organization) {
		System.out.println("jahab");
		organizationDao.addOrganization(organization);		
	}

	@Transactional
	public void updateOrganization(Organization organization) {
		organizationDao.updateOrganization(organization);
	}

	@Transactional
	public void removeOrganization(int id) {
		organizationDao.removeOrganization(id);
	}

	@Transactional
	public Organization getOrganizationById(int id) {
		return organizationDao.getOrganizationById(id);
	}

	@Transactional
	public List<Organization> listOrganizations() {
		return organizationDao.listOrganizations();
	}
	

}
