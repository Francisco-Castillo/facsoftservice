ALTER TABLE Usuarios ADD CONSTRAINT fk_persona_usuario FOREIGN KEY(idpersona) REFERENCES Personas(idpersona) ON UPDATE CASCADE;
ALTER TABLE Clientes ADD CONSTRAINT fk_persona_cliente FOREIGN KEY(idpersona) REFERENCES Personas(idpersona) ON UPDATE CASCADE;

