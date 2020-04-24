package com.example.springApp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.springApp.model.InvoiceUser;

public interface InvoiceRepository extends CrudRepository<InvoiceUser, Long> {

}
