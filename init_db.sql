CREATE DATABASE product_management_db;
CREATE ROLE product_management_user with login '123456'

\c product_management_db
GRANT CREATE ON SCHEMA public TO product_management_user ;