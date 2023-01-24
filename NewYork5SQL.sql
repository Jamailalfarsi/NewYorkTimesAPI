Use newyorkapi;
select*from artical;
Select*from authors;
select*from section;
CREATE TABLE artical( id INTEGER NOT NULL AUTO_INCREMENT, Pub_date VARCHAR(30),Document_type VARCHAR(60),Section_name VARCHAR(60),Uri VARCHAR(100),PRIMARY KEY(id));

Update artical set section_id =9 where id =9;
Update artical set author_id =10 where id =7;

ALTER TABLE artical ADD Column section_id int


SELECT id from section where section = 'Arts' and title = 'Hilderbabes Take Nantucket';

SELECT id from authors where Author = 'Matt Haig';


Select section_id from artical where Section_name="U.S."and id=3;

Select * from artical where Section_name="U.S."and id=3;

Select*from artical where Pub_date between '2021-01-01' AND '2021-12-12';









