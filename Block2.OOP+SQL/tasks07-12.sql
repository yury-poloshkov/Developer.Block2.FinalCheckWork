-- task07
CREATE DATABASE `HumanFriends`;

-- task08 (для одной из таблиц, остальные по аналоги)
CREATE TABLE `HumanFriends`.`Dogs` (
  `id` INT NOT NULL,
  `name` VARCHAR(20) NULL,
  `birthDate` DATE NULL,
  `weight` DOUBLE NULL,
  `color` VARCHAR(45) NULL,
  `arrivalDate` DATE NULL,
  `cage` INT NULL,
  `departureDate` DATE NULL,
  PRIMARY KEY (`id`));

-- task09 (для одной из таблиц, остальные по аналоги)
INSERT INTO `HumanFriends`.`Dogs` (`id`, `name`, `birthDate`, `weight`, `color`) VALUES ('1', 'Bobic', '01.01.2022', '15', 'black');
INSERT INTO `HumanFriends`.`Dogs` (`id`, `name`, `birthDate`, `weight`, `color`) VALUES ('2', 'Marshal', '02.02.2022', '16', 'brown');

-- task10
TRUNCATE TABLE Camels;
CREATE TABLE PackAnimals LIKE Horses;
INSERT INTO PackAnimals
SELECT * FROM Horses;
INSERT INTO PackAnimals (name, birthDate, weight, color)
SELECT name, birthDate, weight, color from Donkeys;

-- task11
CREATE TABLE YoungPackAnimals LIKE PackAnimals;

ALTER TABLE YoungPackAnimals
ADD Age_months INT;

INSERT INTO YoungPackAnimals (name, birthDate, weight, color, Age_months)
SELECT name, birthDate, weight, color, TIMESTAMPDIFF(MONTH, birthDate, '2023-12-12') 
from PackAnimals
Where TIMESTAMPDIFF(MONTH, birthDate, '2023-12-12') between 12 and 36;

-- task12
CREATE TABLE Animals LIKE Horses;

ALTER TABLE Animals
ADD type Varchar(20);

ALTER TABLE Animals
ADD species Varchar(20);

INSERT INTO Animals (name, birthDate, weight, color, type, species)
SELECT  name, birthDate, weight, color, 'Pet', 'Dog' From Dogs;
INSERT INTO Animals (name, birthDate, weight, color, type, species)
SELECT  name, birthDate, weight, color, 'Pet', 'Cat' From Cats;
INSERT INTO Animals (name, birthDate, weight, color, type, species)
SELECT  name, birthDate, weight, color, 'Pet', 'Hamster' From Hamsters;
INSERT INTO Animals (name, birthDate, weight, color, type, species)
SELECT  name, birthDate, weight, color, 'PackAnimal', 'Horse' From Horses;
INSERT INTO Animals (name, birthDate, weight, color, type, species)
SELECT  name, birthDate, weight, color, 'PackAnimal', 'Donckey' From Donkeys;
INSERT INTO Animals (name, birthDate, weight, color, type, species)
SELECT  name, birthDate, weight, color, 'PackAnimal', 'Camel' From Camels;