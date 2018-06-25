CREATE  TABLE  tbl_categories(
cate_id serial PRIMARY KEY ,
cate_title VARCHAR NOT  NULL
);
CREATE TABLE tbl_articles
(
    id serial PRIMARY KEY ,
    title VARCHAR   null,
    description VARCHAR null,
    author VARCHAR null,
    thumbnail VARCHAR null,
    createddate TIMESTAMP DEFAULT NOW(),
    cate_id int REFERENCES tbl_categories(cate_id) on DELETE  SET NULL
);

INSERT INTO tbl_categories(cate_title) VALUES ('Science'),('Novel'),('Romantic'),('Comedy');
INSERT INTO tbl_articles(
	title, description, author, thumbnail, cate_id)
	VALUES 	('The Man and Mice', 'About How the man can travel around the world!', 'Jame Josling', 'http://www.logologo.com/logos/book-logo.jpg',  1),
	('Jane and Samanta on boat', 'At the bottom of the see and come to see', 'Justin Bieber', 'http://www.logologo.com/logos/book-logo.jpg',  4),
	('Come to see me', 'And It is the most important thing', 'Ed Sheeran', 'http://www.logologo.com/logos/book-logo.jpg', 3),
	('Create the world', 'It can make the world better than this', 'Shaksper Kaman', 'http://www.logologo.com/logos/book-logo.jpg', 2),
	('The light out', 'The ghost between the room and condo', 'Preab Sovath', 'http://www.logologo.com/logos/book-logo.jpg',  3),
		('The Man and Mice', 'About How the man can travel around the world!', 'Jame Josling', 'http://www.logologo.com/logos/book-logo.jpg',  1),
	('Jane and Samanta on boat', 'At the bottom of the see and come to see', 'Justin Bieber', 'http://www.logologo.com/logos/book-logo.jpg',  4),
	('Come to see me', 'And It is the most important thing', 'Ed Sheeran', 'http://www.logologo.com/logos/book-logo.jpg', 3),
	('Create the world', 'It can make the world better than this', 'Shaksper Kaman', 'http://www.logologo.com/logos/book-logo.jpg', 2),
	('The light out', 'The ghost between the room and condo', 'Preab Sovath', 'http://www.logologo.com/logos/book-logo.jpg',  3),
	('The 3 idiots', 'Crazy friend study together at the university', 'Stel Komavoyo', 'http://www.logologo.com/logos/book-logo.jpg',  4),
		('The Man and Mice', 'About How the man can travel around the world!', 'Jame Josling', 'http://www.logologo.com/logos/book-logo.jpg',  1),
	('Jane and Samanta on boat', 'At the bottom of the see and come to see', 'Justin Bieber', 'http://www.logologo.com/logos/book-logo.jpg',  4),
	('Come to see me', 'And It is the most important thing', 'Ed Sheeran', '', 3),
	('Create the world', 'It can make the world better than this', 'Shaksper Kaman', 'http://www.logologo.com/logos/book-logo.jpg', 2),
	('The light out', 'The ghost between the room and condo', 'Preab Sovath', 'http://www.logologo.com/logos/book-logo.jpg',  3),
	('The 3 idiots', 'Crazy friend study together at the university', 'Stel Komavoyo', 'http://www.logologo.com/logos/book-logo.jpg',  4),
	('Create the world', 'It can make the world better than this', 'Shaksper Kaman', 'http://www.logologo.com/logos/book-logo.jpg', 2),
	('The light out', 'The ghost between the room and condo', 'Preab Sovath', 'http://www.logologo.com/logos/book-logo.jpg',  3),
	('The 3 idiots', 'Crazy friend study together at the university', 'Stel Komavoyo', 'http://www.logologo.com/logos/book-logo.jpg',  4),
		('The Man and Mice', 'About How the man can travel around the world!', 'Jame Josling', 'http://www.logologo.com/logos/book-logo.jpg',  1),
	('Jane and Samanta on boat', 'At the bottom of the see and come to see', 'Justin Bieber', 'http://www.logologo.com/logos/book-logo.jpg',  4),
	('Come to see me', 'And It is the most important thing', 'Ed Sheeran', 'http://www.logologo.com/logos/book-logo.jpg', 3),
	('Create the world', 'It can make the world better than this', 'Shaksper Kaman', 'http://www.logologo.com/logos/book-logo.jpg', 2),
	('The light out', 'The ghost between the room and condo', 'Preab Sovath', 'http://www.logologo.com/logos/book-logo.jpg',  3),
	('The 3 idiots', 'Crazy friend study together at the university', 'Stel Komavoyo', 'http://www.logologo.com/logos/book-logo.jpg',  4),
	('The 3 idiots', 'Crazy friend study together at the university', 'Stel Komavoyo', 'http://www.logologo.com/logos/book-logo.jpg',  4);