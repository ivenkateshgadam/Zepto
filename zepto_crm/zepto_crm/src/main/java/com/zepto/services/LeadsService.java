package com.zepto.services;

import java.util.List;

import com.zepto.entities.Leads;

public interface LeadsService {
	public void saveLead(Leads lead);
	public List<Leads> getLeads();
	public Leads findLeadById(long id);
	public void deleteLeadById(long id);
}
