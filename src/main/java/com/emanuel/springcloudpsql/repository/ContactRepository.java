package com.emanuel.springcloudpsql.repository;

import com.emanuel.springcloudpsql.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {



}
