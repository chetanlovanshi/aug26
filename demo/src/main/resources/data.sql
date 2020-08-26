DROP TABLE IF EXISTS resource;
 
CREATE TABLE resource (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  experience INT NOT NULL

);
 
INSERT INTO resource (name, experience) VALUES
  ('one', 2),
  ('Bill',3),
  ('three', 4);
  
  
DROP TABLE IF EXISTS resource_skill;
 
CREATE TABLE resource_skill (
  resource_skill_id INT AUTO_INCREMENT  PRIMARY KEY,
  resource_id INT NOT NULL,
  skill VARCHAR NOT NULL
);

INSERT INTO resource_skill (resource_id, skill) VALUES
  (1,'Java'),
  (1,'sql'),
  (2,'Boot'),
  (2,'Java'),
  (3,'Boot'),
  (3,'Java'),
  (3,'sql');
