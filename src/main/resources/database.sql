CREATE DATABASE university;

USE university;

CREATE TABLE `students` (
    `id` int NOT NULL AUTO_INCREMENT,
    `surname` varchar(45) NOT NULL,
    `name` varchar(45) NOT NULL,
    `patronymic` varchar(45) NOT NULL,
    `date_of_birth` date NOT NULL,
    `students_record_book_number` int NOT NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO Students (id, surname, name, patronymic, date_of_birth, students_record_book_number) VALUES
    (1, 'Ivanov', 'Oleksandr', 'Vasylovych', 1998-05-20, 123456),
    (2, 'Petrov', 'Mary', 'Ivanivna', 1999-11-15, 654321),
    (3, 'Sydorenko', 'Petro'', 'Oleksandrovych, 1997-09-05, 987654),
    (4, 'Kovalenko', 'Anna', 'Ihorivna', 2000-03-10, 456789),
    (5, 'Mykhailenko', 'Sergiy', 'Viktorovych', 1998-07-12, 135790),
    (6, 'Novikova', 'Kateryna', 'Volodymyrivna', 1999-02-28, 355613),
    (7, 'Zakharchenko', 'Olha', 'Olegivna', 2001-04-25, 754431),
    (8, 'Pavlov', 'Dmytro', 'Ihorovych', 1996-12-03, 775398),
    (9, 'Lysenko', 'Iryna', 'Valeriivna', 2000-08-17, 687482),
    (10, 'Vasylenko', 'Viktor', 'Yuriyovych', 1997-04-09, 627345),
    (11, 'Krivlenya', 'Nikita', 'Yuriyovych', 2002-11-02, 826365),
    (12, 'Tkachenko', 'Andriy', 'Serhiyovych', 2001-11-22, 833216),
    (13, 'Zaytsev', 'Valentyna', 'Vasylivna', 1999-10-05, 515243),
    (14, 'Kovalchuk', 'Oleksiy', 'Mykolaiovych', 1998-08-14, 235645),
    (15, 'Romanenko', 'Yuliya', 'Andriyivna', 2000-07-19, 285643),
    (16, 'Bilous', 'Andriy', 'Petrovych', 1997-02-17, 266335),
    (17, 'Koval', 'Ivan', 'Vasylivych', 2003-04-28, 567559),
    (18, 'Bublyk', 'Olena', 'Serhiyivna', 2001-01-30, 674654),
    (19, 'Kovalenko', 'Pavlo', 'Ivanovych', 1998-09-24, 346526),
    (20, 'Vynnychenko', 'Alina', 'Oleksandrivna', 1999-05-03, 623654);
