package com.niit.assignment.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.assignment.model.Assignment;

public class AssignmentController {
	
	@RequestMapping(value="/registerFile",method=RequestMethod.POST)
	public String registerFile(@RequestParam("assignments")String assignmentsfile,@ModelAttribute("assignments") Assignment assignments,ModelMap modelMap)
	{
	
		Assignment assig=new Assignment();
		//jukhgkjlouuuuuuuuyhhUser user1=new User();
		assig.setUserId(Long.parseLong(email));
		assig.setId(assig.getUserId());
		assig.setUser(assig);
		assig.setAssignment(assignmentsfile.getBytes());
		//System.out.println("users id is: "+user.getId());
		assignmentRepository.save(assig);
		assignmentRepository.save(assig);
		
		return "login/userModule";
		
		//return"redirect:/showLogin";
	}



}
