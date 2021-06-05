#### Database Normalization (3NF)

    Do not replicate data. Instead, reference data. Point at data.
    Use integers for keys and for references.
    Add a special key column to each table, which you will make
    references to.


#### Exercises

    CREATE TABLE artist {

    id SERIAL,
    name varchar(128) UNIQUE,
    PRIMARY KEY(id)
    };

    CREATE TABLE album {

    id SERIAL,
    title varchar(128) UNIQUE,
    artist_id INTEGER references artist(id) ON delete cascade,
    primary key(id)

    };

    CREATE TABLE genre (

    id SERIAL,
    name varchar(128) UNIQUE,
    primary key(id)
    };

    CREATE TABLE track (

    id SERIAL,
    title varchar(128),
    len INTEGER,
    rating INTEGER,
    count INTEGER,
    album_id INTEGER REFERENCES album(id) on DELETE CASCADE,
    genre_id INTEGER REFERENCES genre(id) on DELETE CASCADE,
    unique(title,album_id),
    PRIMARY KEY(id)

    );

    INSERT INTO artist(name) VALUES ('Led Zepellin');
    INSERT INTO artist(name) VALUES ('AC/DC');

    INSERT INTO album(title,artist_id) VALUES ('WHO MADE WHO',2);
    INSERT INTO album(title,artist_id) VALUES ('IV',1);   
    
    INSERT INTO genre(name) VALUES ('Rock');
    INSERT INTO genre(name) VALUES(´Metal');

    

Unique is an implicit INDEX, you need to search and locate some value,right?


    
    
