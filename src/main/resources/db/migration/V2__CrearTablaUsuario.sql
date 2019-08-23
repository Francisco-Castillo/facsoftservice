CREATE TABLE Usuarios(
 idpersona INT NOT NULL PRIMARY KEY,
 username VARCHAR(20) NOT NULL,
 password VARCHAR(255) NOT NULL,
 fechaalta DATETIME NOT NULL DEFAULT NOW(),
 fechabaja DATETIME,
 estado INT NOT NULL,
 ultimologin DATETIME
);
