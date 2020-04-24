/*
 * package com.example.springApp.controllers;
 * 
 * import org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.PathVariable;
 * 
 * import com.example.springApp.services.InvoiceService;
 * 
 * import lombok.extern.slf4j.Slf4j;
 * 
 * @Slf4j
 * 
 * @Controller public class SuperUserController {
 * 
 * private final InvoiceService invoiceService;
 * 
 * public SuperUserController(InvoiceService invoiceService) {
 * this.invoiceService = invoiceService; }
 * 
 * public String deleteById(@PathVariable String id) { log.debug("Deleting id: "
 * + id); invoiceService.deleteById(Long.valueOf(id)); return "redirect:/"; } }
 */