CREATE DATABASE IF NOT EXISTS mundo;

USE mundo;

CREATE TABLE paises (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre_pais VARCHAR(100) NOT NULL,
    habitantes INT,
    capital VARCHAR(100),
    moneda VARCHAR(50)
);

-- Inserción de datos en la tabla paises
INSERT INTO paises (nombre_pais, habitantes, capital, moneda)
VALUES 
    ('Alemania', 83129285, 'Berlín', 'Euro'),
    ('Australia', 25687041, 'Canberra', 'Dólar australiano'),
    ('Egipto', 104258327, 'El Cairo', 'Libra egipcia'),
    ('India', 1393409038, 'Nueva Delhi', 'Rupia india'),
    ('Italia', 59554023, 'Roma', 'Euro'),
    ('Japón', 125960000, 'Tokio', 'Yen'),
    ('México', 126014024, 'Ciudad de México', 'Peso mexicano'),
    ('Nigeria', 206139589, 'Abuja', 'Naira'),
    ('Reino Unido', 67215293, 'Londres', 'Libra esterlina'),
    ('Rusia', 146171015, 'Moscú', 'Rublo'),
    ('Sudáfrica', 59308690, 'Pretoria', 'Rand'),
    ('Corea del Sur', 51780579, 'Seúl', 'Won surcoreano'),
    ('Turquía', 84339067, 'Ankara', 'Lira turca'),
    ('Estados Unidos', 331893745, 'Washington D.C.', 'Dólar estadounidense'),
    ('Indonesia', 273523621, 'Yakarta', 'Rupia indonesia'),
    ('Arabia Saudita', 34813867, 'Riad', 'Riyal saudí'),
    ('Argentina', 45376763, 'Buenos Aires', 'Peso argentino'),
    ('Canadá', 38005238, 'Ottawa', 'Dólar canadiense'),
    ('Francia', 67348000, 'París', 'Euro'),
    ('China', 1444216107, 'Beijing', 'Yuan'),
    ('Brasil', 212559417, 'Brasília', 'Real brasileño'),
    ('España', 47351567, 'Madrid', 'Euro'),
    ('Bangladesh', 163046161, 'Daca', 'Taka'),
    ('Pakistán', 220892331, 'Islamabad', 'Rupia pakistaní'),
    ('Vietnam', 97338579, 'Hanói', 'Dong'),
    ('Filipinas', 109581085, 'Manila', 'Peso filipino');