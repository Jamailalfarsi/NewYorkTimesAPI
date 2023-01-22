Use NewYorkAPI;

CREATE TABLE section( id INTEGER NOT NULL AUTO_INCREMENT, section VARCHAR(30),copyright VARCHAR(100),title VARCHAR(100),published_date VARCHAR(50),PRIMARY KEY(id));

select*from section;


CREATE TABLE artical( id INTEGER NOT NULL AUTO_INCREMENT, Pub_date VARCHAR(30),Document_type VARCHAR(60),Section_name VARCHAR(60),Uri VARCHAR(50),PRIMARY KEY(id));

select*from artical;

