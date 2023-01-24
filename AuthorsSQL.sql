use NewYorkAPI;

CREATE TABLE authors( id INTEGER NOT NULL AUTO_INCREMENT, Display_name VARCHAR(100),published_date VARCHAR(100),Previous_published_date VARCHAR(100),
Published_date_description VARCHAR(100),Author VARCHAR (50),Publisher VARCHAR (50),Title VARCHAR (50),PRIMARY KEY(id));
drop table authors;

select*from authors;