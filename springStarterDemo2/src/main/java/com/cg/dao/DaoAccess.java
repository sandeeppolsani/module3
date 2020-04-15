package com.cg.dao;

import java.awt.print.Book;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entities.Bank;

@Transactional
@Repository
public class DaoAccess {

	@PersistenceContext
	EntityManager em;
	
	public	void create(Bank b)
	{
		em.persist(b);
		System.out.println("inserted");
	}

	public List<Bank> getEmployeesByName(String name)
	{
		String qry="SELECT b from Bank b where b.name=:name";
		TypedQuery<Bank> q=em.createQuery(qry,Bank.class);
		q.setParameter("name", name);
		return q.getResultList();
	}
	
	public Long TotalStudentCount()
	{
		String qry="SELECT COUNT(b.name) from Bank b";
		TypedQuery<Long> query=em.createQuery(qry, Long.class);
		return (Long)query.getSingleResult();
	}
	
	public void updateBank(Bank b)
	{
		em.merge(b);
		System.out.println("successfully Updated");
	}
	
	public void delete(Bank b)
	{
		em.remove(b);
		System.out.println("Successfully deleted");
	}
	
	public List<Bank> getEmployeeLike(String name)
	{
		Query q=em.createQuery("select bank from Bank bank where bank.name like '"+name+"%'");
		return q.getResultList();
	}
	
	
	
	public Bank findById(int id)
	{
		return em.find(Bank.class, id);
	}
	public void update(int id,String name)
	{
		
	}
	
}
