package com.zepto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zepto.entities.Contacts;
import com.zepto.services.ContactsService;

@Controller
public class BillingController {
	
	@Autowired
	private ContactsService contactsService;
	
	@RequestMapping("/generateBill")
	public String viewBillingPage(@RequestParam("contactId") long id, ModelMap modelMap) {
		Contacts contact = contactsService.findContactById(id);
		modelMap.addAttribute("contact", contact);
		return "generateBill";
	}
}
