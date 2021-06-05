#### Many to Many relationships

    
    Sometimes we need to model a relationships that is many to many
    We need to add connection table with two foregins keys.
    
    There is usually no separate primary key


##### Exercises

    CREATE TABLE member(
    student_id INTEGER references student(id) on DELETE CASCADE,
    course_id INTEGER references course(id) on DELETE CASCADE,
    role INTEGER,
    PRIMARY KEY(student_id, course_id)
    );

    CREATE TABLE student(
    id SERIAL,
    name varchar,
    email varchar unique,
    primary key(id)
    );

    CREATE TABLE course(
    id SERIAL,
    title varchar
    primary key(id)
    );
