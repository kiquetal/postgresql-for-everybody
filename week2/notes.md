#### Working with Tables and PostgreSQL

    INSER INTO USERS(name,email) values ('name1','juan@gmail.com');

    DELETE FROM users WHERE email = 'juan@gmail.com';
    
    
    UPDATE users set name='CHARLES' where email = 'juan@gmail.com';

    SELECT * from users where name like '%e%';

    SELECT * FROM users order by email OFFSET 1 limit 2;
    SELECT * FROM users order BY email DESC LIMIT 2;
    

#### Data Types

    Text Fields
    Binary Fields
    Numeric FIelds
    AUTO_INCREMENT
    




#### Database Keys and Indexes in PostgreSQL.

    
