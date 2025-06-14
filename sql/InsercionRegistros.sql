USE SostenibilidadMinsait;
-- Insertar usuarios
INSERT INTO usuarios (nombre, fecha, password) VALUES
('Ana López', '2024-05-10','ana1234'),
('Carlos Pérez', '2024-06-15','carlos1234'),
('María Sánchez', '2024-05-20','maria1234'),
('Luis Gómez', '2024-07-01', 'luis1234'),
('Sofía Martínez', '2024-05-25', 'sofia1234');

-- Insertar organizadores
INSERT INTO organizadores (nombre, email, password) VALUES
('EcoEvent', 'eco@event.com', 'pass1234'),
('GreenFuture', 'info@greenfuture.org', 'green2024'),
('Sostenibilidad YA', 'contact@sostya.com', 'sost321'),
('Planeta Limpio', 'admin@planetalim.com', 'limpio999'),
('Vida Verde', 'vida@verde.com', 'verdevida');

-- Insertar ubicaciones
INSERT INTO ubicaciones (online, direccion) VALUES
(TRUE, 'https://evento1.com'),
(FALSE, 'Av. Principal 123, Madrid'),
(FALSE, 'Calle Verde 456, Barcelona'),
(TRUE, 'https://evento2.org'),
(FALSE, 'Plaza Eco 789, Valencia');

-- Insertar categorías
INSERT INTO categorias (nombre, descripcion) VALUES
('Reciclaje', 'Eventos enfocados en técnicas de reciclaje y reutilización.'),
('Energía Renovable', 'Charlas sobre fuentes de energía limpia.'),
('Agricultura Sostenible', 'Prácticas agrícolas respetuosas con el medio ambiente.'),
('Educación Ambiental', 'Programas educativos sobre sostenibilidad.'),
('Movilidad Verde', 'Soluciones de transporte sostenibles.');

-- Insertar eventos
INSERT INTO eventos (nombre, fecha, duracion, idUbicacion, idOrganizador, idCategoria) VALUES
('Taller de Reciclaje Creativo', '2025-06-01', 2.5, 2, 1, 1),
('Congreso Energía Solar', '2025-07-15', 4.0, 1, 2, 2),
('Feria Agroecológica', '2025-08-20', 3.0, 3, 3, 3),
('Webinar Educación Verde', '2025-06-10', 1.5, 4, 4, 4),
('Ciclismo Urbano Sostenible', '2025-09-05', 2.0, 5, 5, 5);

-- Insertar inscripciones
INSERT INTO inscripciones (idUsuario, idEvento, cancelado) VALUES
(1, 1, FALSE),
(2, 2, FALSE),
(3, 3, TRUE),
(4, 4, FALSE),
(5, 5, FALSE),
(1, 2, TRUE),
(2, 4, FALSE);
