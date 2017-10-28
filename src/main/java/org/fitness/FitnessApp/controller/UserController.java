package org.fitness.FitnessApp.controller;

import java.util.List;

import org.fitness.FitnessApp.model.FitnessUser;
import org.fitness.FitnessApp.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController
{
	
	@Autowired
	private UserServiceImpl service;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String saveUser(@ModelAttribute("fitnessUser")FitnessUser user,ModelMap map)
	{
		int id=service.saveUser(user);
		String str="Successfully registered with id="+id;
		map.addAttribute("str", str);
		return "Login";
	}
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String listUser(@ModelAttribute("fitnessUser")FitnessUser user,ModelMap map)
	{
		List<FitnessUser> fuser=service.getList();
		map.addAttribute("str", fuser);
		return "Login";
	}

	
	

}
