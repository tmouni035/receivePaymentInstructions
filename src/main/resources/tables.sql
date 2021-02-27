CREATE table HK21.transaction_tbl(
  id BIGINT NOT NULL AUTO_INCREMENT,
  message_id BIGINT NOT NULL,
  endToEndId INT NOT NULL,
  debtorAccount VARCHAR(35),
  debtorName VARCHAR(20),
  debtorAddress VARCHAR(20),
  creditorAccount VARCHAR(20),
  creditorName VARCHAR(20),
  creditorAddress VARCHAR(20),
  debtorAgentId INT,
  creditorAgentId INT,
  paymentCurrency VARCHAR(20),
  paymentAmount FLOAT,
 valueDate DATE,
  remittanceInfo VARCHAR(20),
   PRIMARY KEY (id )

)


CREATE table HK21.accounts_tbl( 
  id BIGINT NOT NULL AUTO_INCREMENT,
  name  BIGINT NOT NULL,
   PRIMARY KEY (id )
)


CREATE table HK21.sanctions_tbl( 
  id BIGINT NOT NULL AUTO_INCREMENT,
  country  BIGINT NOT NULL,
  isSanctioned BIT NOT NULL,
   PRIMARY KEY (id )
)


CREATE table HK21.account_bal_tbl( 
  id BIGINT NOT NULL AUTO_INCREMENT,
  account_name  varchar(50) NOT NULL,
  account_type  varchar(50) NOT NULL,
  balance  varchar(50) NOT NULL,
   PRIMARY KEY (id )
)
