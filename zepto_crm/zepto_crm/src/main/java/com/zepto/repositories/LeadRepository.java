package com.zepto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zepto.entities.Leads;

public interface LeadRepository extends JpaRepository<Leads, Long> {

}
