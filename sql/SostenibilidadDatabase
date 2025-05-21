DROP DATABASE IF EXISTS SostenibilidadMinsait;
CREATE DATABASE SostenibilidadMinsait;
USE SostenibilidadMinsait;

CREATE TABLE IF NOT EXISTS usuarios (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre varchar(40),
    fecha DATE,
    password varchar(80)
)engine = InnoDB;

CREATE TABLE IF NOT EXISTS organizadores(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre varchar(50),
    email varchar(60),
    password varchar(80)
)engine = InnoDB;

CREATE TABLE IF NOT EXISTS ubicaciones(
    id INT PRIMARY KEY AUTO_INCREMENT,
    online boolean,
    direccion varchar(60)
)engine = InnoDB;

CREATE TABLE IF NOT EXISTS categorias(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre varchar(50),
    descripcion varchar(200)
)engine = InnoDB;


CREATE TABLE IF NOT EXISTS eventos(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre varchar(60),
    fecha DATE,
    duracion DECIMAL (3,1),
    idUbicacion INT,
    idOrganizador INT,
    idCategoria INT,
    CONSTRAINT fk_ubicacion FOREIGN KEY (idUbicacion) REFERENCES ubicaciones(id),
    CONSTRAINT fk_organizador FOREIGN KEY (idOrganizador) REFERENCES organizadores(id),
    CONSTRAINT fk_categoria FOREIGN KEY (idCategoria) REFERENCES categorias(id)
)engine = InnoDB;

CREATE TABLE IF NOT EXISTS inscripciones(
    id INT PRIMARY KEY AUTO_INCREMENT,
    idUsuario INT,
    idEvento INT,
    cancelado boolean,
    CONSTRAINT fk_usuario FOREIGN KEY (idUsuario) REFERENCES usuarios(id),
    CONSTRAINT fk_evento FOREIGN KEY (idEvento) REFERENCES eventos(id)
)engine = InnoDB;



