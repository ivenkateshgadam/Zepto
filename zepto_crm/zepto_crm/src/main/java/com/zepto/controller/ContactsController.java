package com.zepto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zepto.entities.Contacts;
import com.zepto.entities.Leads;
import com.zepto.services.ContactsService;
import com.zepto.services.LeadsService;

@Controller
public class ContactsController {
	
	@Autowired
	private LeadsService leadsService;
	
	@Autowired
	private ContactsService contactsService;
	
	@RequestMapping("/saveContacts")
	public String saveContactsInfo(@RequestParam("id")long id){
		Leads lead = leadsService.findLeadById(id);
		Contacts contact = new Contacts ();
		contact.setId(lead.getId());
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setLeadSource(lead.getLeadSource());
		contactsService.saveContacts(contact);
		
		leadsService.deleteLeadById(lead.getId());
		
		return "contactsConfirmationPage";
	}
	
	@RequestMapping("/getContacts")
	public String getAllLeads(ModelMap modelMap) {
		List<Contacts> contacts = contactsService.getContacts();
		modelMap.addAttribute("contacts", contacts);
		return "contactsSearchResult";
	}
	
	@RequestMapping("/getContactById")
	public String saveLead(@RequestParam("id") long id, ModelMap modelMap) {
		Contacts contact = contactsService.findContactById(id);
		modelMap.addAttribute("contact", contact);
		return "contactsInfo";
	}
}
