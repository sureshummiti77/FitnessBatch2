package org.fitness.FitnessApp.daoImpl;

import java.util.List;

import org.fitness.FitnessApp.model.FitnessUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl 
{

	@Autowired
	private HibernateTemplate ht;
	
	public int saveUser(FitnessUser user)
	{
		return (Integer)ht.save(user);
	}
	
	
	public List<FitnessUser> getList()
	{
		return ht.loadAll(FitnessUser.class);
		
	}
	
}
