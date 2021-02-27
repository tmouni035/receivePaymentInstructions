package com.hackathon.hcl.demo.controller;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction_tb1")
public class Transaction {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int messageId;
	@Column
	private int endToEndId;
	@Column
	private String debtorAccount;
	@Column
	private String debtorName;
	@Column
	private String debtorAddress;
	@Column
	private String creditorAccount;
	@Column
	private String creditorName;
	@Column
	private String creditorAddress;
	@Column
	private int debtorAgentId;
	@Column
	private int creditorAgentId;
	@Column
	private String paymentCurrency;
	@Column
	private float paymentAmount;
	@Column
	private java.util.Date valueDate;
	@Column
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
