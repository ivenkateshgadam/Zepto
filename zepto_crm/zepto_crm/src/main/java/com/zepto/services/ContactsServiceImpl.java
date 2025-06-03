package com.zepto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.entities.Contacts;
import com.zepto.repositories.ContactsRepository;

@Service
public class ContactsServiceImpl implements ContactsService {
	
	@Autowired
	private ContactsRepository contactsRepo;

	@Override
	public void saveContacts(Contacts contact) {
		contactsRepo.save(contact);
	}

	@Override
	public List<Contacts> getContacts() {
			List<Contacts> contacts = contactsRepo.findAll();
			return contacts;
		
	}

	@Override
	public Contacts findContactById(long id) {
		Optional<Contacts> findById = contactsRepo.findById(id);
		Contacts contacts = findById.get();
		return contacts;
	}

}
