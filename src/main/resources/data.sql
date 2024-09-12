CREATE TABLE product (
                         id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
                         amount DOUBLE DEFAULT 0 NULL,
                         sku VARCHAR(32) NOT NULL,
                         quantity INTEGER DEFAULT 0 NULL
);
CREATE TABLE customer (
     id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
     customer_name VARCHAR(128) NOT NULL,
     ssn VARCHAR(14) NOT NULL,
     date_of_birth TIMESTAMP NOT NULL
);
CREATE TABLE orders (
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    storeId INT NOT NULL,
    customerId INT NOT NULL,
    orderDate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    orderTime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    notes VARCHAR(256),
    chargesId INT NOT NULL,
    foreign key (customerId) references customer(id),
    foreign key (chargesId) references product(id)
);
insert into Product (id, amount, sku, quantity) VALUES (1, 20.0, 'sku001', 10);
insert into Product (id, amount, sku, quantity) VALUES (2, 25.0, 'sku001', 10);
insert into Customer (id, customer_name, ssn, date_of_birth) values (1, 'customer1','ssn001', current_date);
insert into Customer (id, customer_name, ssn, date_of_birth) values (2, 'customer2','ssn002', current_date);
