package com.hackathon.hcl.demo.controller;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int messageId;
	private int endToEndId;
	private String debtorAccount;
	private String debtorName;
	private String debtorAddress;
	private String creditorAccount;
	private String creditorName;
	private String creditorAddress;
	private int debtorAgentId;
	private int creditorAgentId;
	private String paymentCurrency;
	private float paymentAmount;
	private java.util.Date valueDate;
	private String remittanceInfo;
	
	public Transaction() {
    }
	
	public Transaction(int messageId, int endToEndId, String debtorAccount, String debtorName,
			String debtorAddress, String creditorAccount, String creditorName, String creditorAddress,
			int debtorAgentId, int creditorAgentId, String paymentCurrency, float paymentAmount, Date valueDate,
			String remittanceInfo) {
		super();
		this.messageId = messageId;
		this.endToEndId = endToEndId;
		this.debtorAccount = debtorAccount;
		this.debtorName = debtorName;
		this.debtorAddress = debtorAddress;
		this.creditorAccount = creditorAccount;
		this.creditorName = creditorName;
		this.creditorAddress = creditorAddress;
		this.debtorAgentId = debtorAgentId;
		this.creditorAgentId = creditorAgentId;
		this.paymentCurrency = paymentCurrency;
		this.paymentAmount = paymentAmount;
		this.valueDate = valueDate;
		this.remittanceInfo = remittanceInfo;
	}
	
	

}
