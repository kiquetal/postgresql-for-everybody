#### Week 1

##### History of Relational Databases

    Old Sorted    
    Sequential Master Update 1970.
    New Sorted

    Tapes need lineal access
    We worked base on the idea the data was sorted.

    
    Relational Databases model data by storing rows and columns in tables.
    
    Structured Query Langagues, National Institute of Standards and Technology.
    
##### SQL Architecture

    sudo su -
    su - postgress
    psql -U postgres

    posgres# 
    CREATE USER pg4e with PASSWORD 'bla';
    CREATE DATABASE people with owner 'pg4e'
    \l list database
  
    psql -U pg4e -h 127.0.0.1 -d people
    \d+ users
  
