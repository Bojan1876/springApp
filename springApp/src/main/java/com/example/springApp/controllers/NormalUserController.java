package com.example.springApp.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springApp.model.InvoiceUser;

@Controller
public class NormalUserController {

	private static final String INVOICE_INVOICEFORM_URL="invoice/invoiceform";

	/*
	 * private final InvoiceService invoiceService;
	 * 
	 * public NormalUserController(InvoiceService invoiceService) {
	 * this.invoiceService = invoiceService; }
	 */
	@GetMapping("index")
	public String greeting(Map<String, Object> model) {
		model.put("message", "Hi");
		return "index";
	}

	/*
	 * @GetMapping("invoice/new") public String newInvoice(Model model) {
	 * model.addAttribute("invoice", new InvoiceUser());
	 * 
	 * System.out.println("New Invoice"); return INVOICE_INVOICEFORM_URL; }
	 * 
	 * @PostMapping("invoice/{id}/update") public String updateInvoice(@PathVariable
	 * String id, Model model) { model.addAttribute("invoice",
	 * invoiceService.findInvoiceById(Long.valueOf(id)));
	 * 
	 * return INVOICE_INVOICEFORM_URL; }
	 */

}
