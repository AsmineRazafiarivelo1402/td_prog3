CREATE TABLE Product(
    id int primary key,
    *name varchar(150),
    price number,
    creation_datetime timestamp
);
CREATE TABLE Product_category(
    id int primary key,
     name varchar(150),
     #product_id int REFERENCES Product(id)
);