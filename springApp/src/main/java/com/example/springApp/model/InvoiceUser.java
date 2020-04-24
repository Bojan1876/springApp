package com.example.springApp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class InvoiceUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int invoiceNumber;
	private Date dateOfInvoice;
	private String description;
	private String amount;
	
	@Enumerated(value = EnumType.STRING)
	private Status status;

}
