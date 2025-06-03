package com.zepto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zepto.entities.Leads;
import com.zepto.services.LeadsService;

@Controller
public class LeadsController {
	
	@Autowired
	private LeadsService leadsService;
	
	@RequestMapping("/lead")
	public String showLeadsPage() {
		return "leads";
	}
	
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute("lead") Leads lead, ModelMap modelMap) {
		leadsService.saveLead(lead);
		modelMap.addAttribute("lead", lead);
		return "leadsInfo";
	}
	
	@RequestMapping("/getleads")
	public String getAllLeads(ModelMap modelMap) {
		List<Leads> leads = leadsService.getLeads();
		modelMap.addAttribute("leads", leads);
		return "leadsSearchResult";
	}
	
	@RequestMapping("/getLead")
	public String saveLead(@RequestParam("id") long id, ModelMap modelMap) {
		Leads lead = leadsService.findLeadById(id);
		modelMap.addAttribute("lead", lead);
		return "leadsInfo";
	}
}
