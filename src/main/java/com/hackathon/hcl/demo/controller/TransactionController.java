package com.hackathon.hcl.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TransactionController {
	
	@Autowired
    private TransactionService service;
	
	@GetMapping("/transactions")
	public List<Transaction> list() {
	    return service.listAll();
	}

}
