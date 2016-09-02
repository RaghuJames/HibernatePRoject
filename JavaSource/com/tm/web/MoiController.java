package com.tm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tm.model.Cost;
import com.tm.service.CostService;

@Controller
@RequestMapping(value="/insert.htm")
public class MoiController {

	@Autowired
	private CostService costService=null;
	
	@RequestMapping(method=RequestMethod.GET)
	public String getFronPageFirstTime(ModelMap map){
		System.out.println("-------INSIDE");
		Cost cost =  new Cost();
		map.put("ControllerCommand", cost);
		return "cost";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	private String insert(@ModelAttribute("ControllerCommand")Cost cost){
		this.costService.save(cost);
		return "cost";
	}
	
}
