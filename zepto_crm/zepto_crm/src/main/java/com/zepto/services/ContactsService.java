package com.zepto.services;

import java.util.List;

import com.zepto.entities.Contacts;

public interface ContactsService {
	
	public void saveContacts(Contacts contact);
	public List<Contacts> getContacts();
	public Contacts findContactById(long id);
}
