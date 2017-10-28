package org.fitness.FitnessApp.service;

import java.util.List;

import org.fitness.FitnessApp.daoImpl.UserDaoImpl;
import org.fitness.FitnessApp.model.FitnessUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl 
{
	@Autowired
	private UserDaoImpl dao;
	
	public int saveUser(FitnessUser user)
	{
		return dao.saveUser(user);
	}
	
	public List<FitnessUser> getList()
	{
		return dao.getList();
	}
	
}
