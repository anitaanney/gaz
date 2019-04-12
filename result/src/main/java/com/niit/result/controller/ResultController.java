package com.niit.result.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.result.model.Result;
import com.niit.result.service.ResultService;
import com.niit.timetable.model.*;
import com.niit.timetable.service.*;

@Controller
@RequestMapping("/result")
public class ResultController {

	@Autowired
	private ResultService resultService;
	
	@RequestMapping("/list")
	public String listResults(Model theModel) {
		List<Result> theResults = resultService.getResults();
		theModel.addAttribute("results", theResults);
		return "list-result";
	}
	
	@GetMapping("/showForm")
	public String showFormForAdd(Model theModel) {
		Result theResult = new Result();
		theModel.addAttribute("result", theResult);
		return "result-entry";
	}
	
	@PostMapping("/saveResult")
	public String saveTimetable(@ModelAttribute("result") Result theResult) {
		resultService.saveResult(theResult);	
		return "redirect:/list";
	}
	
	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("resultId") int theId,
									Model theModel) {
		Result  theResult= resultService.getResult(theId);	
		theModel.addAttribute("result", theResult );
		return "result-entry";
	}
	
	@GetMapping("/delete")
	public String deleteResult(@RequestParam("resultId") int theId) {
		resultService.deleteResult(theId);
		return "redirect:/list";
	}
}
