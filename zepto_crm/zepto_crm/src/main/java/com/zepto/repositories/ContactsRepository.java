package com.zepto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zepto.entities.Contacts;

public interface ContactsRepository extends JpaRepository<Contacts, Long> {

}
