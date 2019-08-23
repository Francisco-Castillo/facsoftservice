CREATE TABLE Clientes(
 idpersona INT NOT NULL PRIMARY KEY,
 codigo VARCHAR(10),
 fechadealta DATETIME NOT NULL DEFAULT NOW(),
 fechadebaja DATETIME,
 estado INT NOT NULL
);
