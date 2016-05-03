package com.spring.legend.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import com.spring.legend.model.Organization;

@Service
@Transactional
public class OrganizationDaoImpl implements OrganizationDao {
    
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	public void addOrganization(Organization organization) {
		System.out.println("dao Imple");
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(organization);
		System.out.println("new organization added");		
	}

	public void updateOrganization(Organization organization) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(organization);
		System.out.println("organization updated");
	}

	public void removeOrganization(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Organization org = (Organization) session.load(Organization.class,id);
		if(null != org) {
		 session.delete(org);
		}
	}

	public Organization getOrganizationById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Organization org = (Organization) session.load(Organization.class, id);
		return org;
	}

	public List<Organization> listOrganizations() {
		Session session = this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Organization> list= session.createQuery("from Organization").list();
		return list;
	}
}
