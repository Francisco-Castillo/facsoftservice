CREATE TABLE Prestamos(
 idprestamo INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
 monto DECIMAL(7,2) NOT NULL,
 fechasolicitud DATE NOT NULL,
 cantidadcuotas INT NOT NULL,
 tna DECIMAL(7,2) NOT NULL,
 gastosadmin DECIMAL(7,2),
 segurovida DECIMAL(7,2) NOT NULL,
 iva DECIMAL(7,2) NOT NULL,
 observaciones VARCHAR(200),
 estado INT NOT NULL
);

CREATE TABLE Cuotas(
 idcuota INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
 nrocuota INT NOT NULL,
 valor DECIMAL(7,2),
 fechavencimiento DATE NOT NULL,
 estado INT NOT NULL,
 idprestamo INT NOT NULL
);

