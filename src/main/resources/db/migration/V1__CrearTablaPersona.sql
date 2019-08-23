CREATE TABLE Personas(
 idpersona INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
 apellido VARCHAR(50) NOT NULL,
 nombre VARCHAR(50) NOT NULL,
 documento VARCHAR(15) NOT NULL,
 tipodocumento INT NOT NULL,
 sexo INT NOT NULL,
 fechadenacimiento DATE NOT NULL,
 correo VARCHAR(100),
 telefono VARCHAR(30) NOT NULL
);
