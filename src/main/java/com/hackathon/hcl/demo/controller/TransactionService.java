package com.hackathon.hcl.demo.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TransactionService {
	
	@Autowired
    private TransactionRepository transactionRepository;
	
	public List<Transaction> listAll() {
        return transactionRepository.findAll();
    }
	
	public void save(Transaction transaction) {
		transactionRepository.save(transaction);
    }
     
//    public Transaction get(Integer messageId) {
//        return transactionRepository.findById(messageId).get();
//    }
//     
//    public void delete(Integer id) {
//    	transactionRepository.deleteById(id);
//    }

}
