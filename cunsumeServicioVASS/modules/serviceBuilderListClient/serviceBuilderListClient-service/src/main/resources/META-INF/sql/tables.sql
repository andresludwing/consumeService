create table VASS_persona (
	uuid_ VARCHAR(75) null,
	customerId INTEGER not null primary key,
	storeId INTEGER,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	email VARCHAR(75) null,
	addressId INTEGER,
	activebool VARCHAR(75) null,
	createDate VARCHAR(75) null,
	lastUpdate VARCHAR(75) null,
	active_ VARCHAR(75) null
);