-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-06-2019 a las 18:58:05
-- Versión del servidor: 10.1.40-MariaDB
-- Versión de PHP: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tfg`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actores_pelicula`
--

CREATE TABLE `actores_pelicula` (
  `pelicula_model_id` int(11) NOT NULL,
  `lista_actores_id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `actores_pelicula`
--

INSERT INTO `actores_pelicula` (`pelicula_model_id`, `lista_actores_id`) VALUES
(2, 1),
(2, 2),
(3, 3),
(3, 4),
(4, 5),
(4, 6),
(5, 7),
(5, 8),
(6, 11),
(6, 12),
(7, 13),
(7, 14),
(8, 17),
(8, 18),
(9, 19),
(9, 20),
(10, 9),
(10, 10),
(11, 15),
(11, 16);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actor_model`
--

CREATE TABLE `actor_model` (
  `id` int(11) NOT NULL,
  `fecha_defunción` date DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `lugar_nacimiento` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `ruta_img` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `actor_model`
--

INSERT INTO `actor_model` (`id`, `fecha_defunción`, `fecha_nacimiento`, `lugar_nacimiento`, `nombre`, `ruta_img`) VALUES
(1, NULL, '1974-11-11', 'Los Angeles', 'Leonardo Dicaprio', './../../assets/img/actores/leonardo dicaprio.jpg'),
(2, NULL, '1975-10-05', 'Berkshire, Inglaterra', 'Kate Winslet', './../../assets/img/actores/Kate_Winslet.jpg'),
(3, NULL, '1965-04-04', 'Nueva York', 'Robert Downey Jr', './../../assets/img/actores/Robert_Downey_Jr.jpg'),
(4, NULL, '1989-10-01', 'Sacramento, California', 'Brie Larson', './../../assets/img/actores/Brie_Larson.jpg'),
(5, NULL, '1954-02-18', 'Englewood, Nueva Jersey', 'John Joseph Travolt', './../../assets/img/actores/John_travoltra.jpg'),
(6, NULL, '1948-09-26', 'Cambridge', 'Olivia Newton-John', './../../assets/img/actores/olivia.jpg'),
(7, NULL, '1981-05-12', 'Los Angeles', 'Ramy Said Malek', './../../assets/img/actores/rami.jpg'),
(8, NULL, '1994-01-17', 'Nueva York', 'Lucy Boynton', './../../assets/img/actores/Lucy_Boynton.jpg'),
(9, NULL, '1947-07-30', 'Thal, Austria', 'Arnold Alois Schwarzenegger', './../../assets/img/actores/Arnold.jpg'),
(10, NULL, '1956-09-26', 'Salisbury Maryland', 'Linda Carrol Hamilton', './../../assets/img/actores/Linda.jpg'),
(11, NULL, '1956-07-09', 'Concord, California', 'Tom Hanks', './../../assets/img/actores/Tom.jpg'),
(12, NULL, '1966-04-08', 'Dallas, Texas', 'Robin Gayle Wright', './../../assets/img/actores/Robin.jpg'),
(13, NULL, '1940-04-25', 'Nueva Jork', 'Al Pacino', './../../assets/img/actores/Al_Pacino.jpg'),
(14, NULL, '1946-01-05', 'Los Angeles', 'Diane Keaton', './../../assets/img/actores/Diane.jpg'),
(15, NULL, '1997-04-01', 'Londres', 'Asa Maxwell Thornton Farr Butterfield', './../../assets/img/actores/Asa.jpg'),
(16, NULL, '1973-07-06', 'Clifton, Nueva Jersey', 'Vera Ann Farmiga', './../../assets/img/actores/Vera.jpg'),
(17, NULL, '1978-01-20', 'Trappes, Yvelines', 'Omar Sy', './../../assets/img/actores/omar-sy.jpg'),
(18, NULL, '1955-09-21', 'París', 'François Cluzet', './../../assets/img/actores/Francois-Cluzet.jpg'),
(19, '1967-06-08', '1913-11-05', 'Bengala Occidental, India', 'Vivien Leigh', './../../assets/img/actores/Vivien_Leigh.jpg'),
(20, '1960-11-16', '1901-02-01', 'Cádiz, Ohio, Estados Unidos', 'Clark Gable', './../../assets/img/actores/Clark _Gable.jpg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `director_model`
--

CREATE TABLE `director_model` (
  `id` int(11) NOT NULL,
  `fecha_defunción` date DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `lugar_nacimiento` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `ruta_img` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `director_model`
--

INSERT INTO `director_model` (`id`, `fecha_defunción`, `fecha_nacimiento`, `lugar_nacimiento`, `nombre`, `ruta_img`) VALUES
(1, NULL, '1954-08-16', 'Kapuskasing, Ontario, Canadá', 'James Francis Cameron', './../../assets/img/directores/James.jfif'),
(2, NULL, '1970-02-03', 'Cleveland, Ohio', 'Anthony Russo', './../../assets/img/directores/Anthony_Russo.png'),
(3, NULL, '1946-07-20', 'Filadelfia, Pensilvania', 'Randal Kleiser', './../../assets/img/directores/Randal_Kleiser.jpg'),
(4, NULL, '1965-09-17', 'Nueva York', 'Bryan Jay Singer', './../../assets/img/directores/Bryan.jpg'),
(5, NULL, '1952-05-14', 'Chicago', 'Robert Lee Zemeckis', './../../assets/img/directores/Robert.jpg'),
(6, NULL, '1939-04-07', 'Detroit', 'Francis Ford Coppola', './../../assets/img/directores/Robert.jpg'),
(7, NULL, '1954-01-01', 'Bridlington', 'Mark Herman', './../../assets/img/directores/Mark_Herman.jpg'),
(8, NULL, '1973-04-14', 'Suresnes, Altos del Sena', 'Olivier Nakache', './../../assets/img/directores/Olivier_Nakache.jpg'),
(9, '1949-01-06', '1889-02-23', 'California, Estados Unidos', 'Victor Fleming', './../../assets/img/directores/Victor_Fleming.jpg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `genero_model`
--

CREATE TABLE `genero_model` (
  `id` int(11) NOT NULL,
  `genero` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `genero_model`
--

INSERT INTO `genero_model` (`id`, `genero`) VALUES
(1, 'Acción'),
(2, 'Comedia'),
(3, 'Drama'),
(4, 'Musical'),
(5, 'Biografico'),
(6, 'Ciencia Ficción'),
(7, 'Romantico'),
(8, 'Policiaco');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `peliculas_genero`
--

CREATE TABLE `peliculas_genero` (
  `pelicula_model_id` int(11) NOT NULL,
  `lista_generos_id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `peliculas_genero`
--

INSERT INTO `peliculas_genero` (`pelicula_model_id`, `lista_generos_id`) VALUES
(2, 3),
(2, 7),
(3, 1),
(3, 6),
(4, 4),
(4, 7),
(5, 3),
(5, 5),
(6, 2),
(6, 3),
(7, 3),
(7, 8),
(8, 2),
(8, 3),
(9, 3),
(9, 7),
(10, 1),
(11, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pelicula_model`
--

CREATE TABLE `pelicula_model` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `duracion` varchar(255) DEFAULT NULL,
  `estreno` varchar(255) DEFAULT NULL,
  `premios` varchar(255) DEFAULT NULL,
  `presupuesto` varchar(255) DEFAULT NULL,
  `productora` varchar(255) DEFAULT NULL,
  `ruta_img` varchar(255) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `director_id` int(11) DEFAULT NULL,
  `trailer` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pelicula_model`
--

INSERT INTO `pelicula_model` (`id`, `descripcion`, `duracion`, `estreno`, `premios`, `presupuesto`, `productora`, `ruta_img`, `titulo`, `director_id`, `trailer`) VALUES
(2, 'Una joven de la alta sociedad abandona a su arrogante pretendiente por un artista humilde en el trasatlántico que se hundió durante su viaje inaugural.\r\n', '3h 15m', '1997', 'Oscar a la mejor película, Oscar a la mejor dirección', '$200 000 000', '20th Century Fox, Paramount Pictures,Lightstorm Entertainment', './../../assets/img/pelis/titanic.jpg', 'Titanic', 1, 'https://www.youtube.com/watch?v=2e-eXJ6HgkQ'),
(3, 'Los 	Vengadores restantes deben encontrar una manera de recuperar a sus aliados para un enfrentamiento épico con Thanos, el malvado que diezmó el planeta y el universo.\r\n', '3h 1m', '2019', ' ', '$356 000 000', 'Marvel Studios', './../../assets/img/pelis/avenger.jpg', 'Endgame', 2, 'https://www.youtube.com/watch?v=TcMBFSGVi1c'),
(4, 'El rebelde Danny Zuko y la inocente australiana Sandy mantienen un romance durante las vacaciones, creyendo que no se volverán a ver; sin embargo, para sorpresa de ambos, se reencuentran en la escuela secundaria al empezar el nuevo curso.\r\n', '1h 50m', '1978', 'Óscar 1978', '$6 000 000', 'RSO Records, Paramount Pictures', './../../assets/img/pelis/grease.jpg', 'Grease', 3, 'https://www.youtube.com/watch?v=f2CCEixOVVU'),
(5, 'Freddie desafía los estereotipos y se convierte en uno de los vocalistas más reconocidos de la música mundial. Después de dejar la banda Queen para seguir una carrera como solista, Mercury se reúne con la banda para dar una de las mejores actuaciones.', '2h 14m', '2018', 'Oscar Mejor película', '$52 400 000', 'GK Films', './../../assets/img/pelis/bohemian_rhapsody.jpg', 'Bohemian Rhapsody', 4, 'https://www.youtube.com/watch?v=LTAIlPsMOs4'),
(6, 'La simpleza e inocencia de un sureño lo impulsan a través de hechos importantes de la historia moderna de EE.UU.\r\n', '2h 22m', '1994', 'Oscar a la mejor película', '$55 000 000 ', 'Paramount Pictures', './../../assets/img/pelis/forrest.jpg', 'Forrest Gump', 5, 'https://www.youtube.com/watch?v=Cyh1LpxnaxI'),
(7, 'Una adaptación ganadora del Premio de la Academia, de la novela de Mario Puzo acerca de la familia Corleone.', '2h 55m', '1972', '', '$6 000 000', 'Paramount Pictures', './../../assets/img/pelis/elpadrino.jpg', 'El Padrino', 6, 'https://www.youtube.com/watch?v=gCVj1LeYnsc'),
(8, 'Una extraña amistad se desarrolla entre un millonario que quedó paralítico en un accidente y un joven de los suburbios.', '1h 58m', '2011', 'Premio Goya a la mejor película europea', '€10 000 000', 'Gaumont Film Company', './../../assets/img/pelis/intouchables.jpg', 'Intocable', 8, 'https://www.youtube.com/watch?v=aYCSrM8mmmo'),
(9, 'Este drama se centra en la vida de la petulante belleza sureña.La película narra su supervivencia a través de la historia trágica del Sur durante la Guerra Civil y la Reconstrucción, y sus enredados amorosos con Ashley Wilkes y Rhett Butler.', '3h 58m\r\n', '1939', ' Oscar a la mejor película', '$3 900 000\r\n\r\n', 'Metro-Goldwyn-Mayer', './../../assets/img/pelis/lo_que_el.jpg', 'Lo que el viento se llevó', 9, 'https://www.youtube.com/watch?v=lZfaM3ghoGY'),
(10, 'Un asesino cibernético del futuro es enviado a Los Ángeles, para matar a la mujer que procreará a un líder.', '1h 48m', '1984', '', '$6 400 000', 'Hemdale Film', './../../assets/img/pelis/terminator.jpg', 'Terminator', 1, 'https://www.youtube.com/watch?v=k64P4l2Wmeg'),
(11, 'Durante la Segunda Guerra Mundial, el pequeño hijo de un comandante de un campo de concentración desarrolla una amistad prohibida con un niño judío de 8 años.', '1h 34m', '2008', 'A la mejor actriz Vera Farmiga', '$12 500 000', 'BBC Films', './../../assets/img/pelis/El_Nino_Con_El_Pijama_De_Rayas-Cartel.jpg', 'El niño con el pijama de rayas', 7, 'https://www.youtube.com/watch?v=hd028fGZdG8');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol_model`
--

CREATE TABLE `rol_model` (
  `id` int(11) NOT NULL,
  `rol` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `rol_model`
--

INSERT INTO `rol_model` (`id`, `rol`) VALUES
(1, 'ADMIN'),
(2, 'USER');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario_model`
--

CREATE TABLE `usuario_model` (
  `id` int(11) NOT NULL,
  `correo` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `rol_model_id` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario_model`
--

INSERT INTO `usuario_model` (`id`, `correo`, `password`, `username`, `rol_model_id`) VALUES
(1, 'admin@tfg.es', 'admin', 'admin', 1),
(2, 'user@tfg.es', 'user', 'user', 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `actores_pelicula`
--
ALTER TABLE `actores_pelicula`
  ADD PRIMARY KEY (`pelicula_model_id`,`lista_actores_id`),
  ADD KEY `FKorn5bwd6qxrt6v7ud0u5pfehb` (`lista_actores_id`);

--
-- Indices de la tabla `actor_model`
--
ALTER TABLE `actor_model`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `director_model`
--
ALTER TABLE `director_model`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `genero_model`
--
ALTER TABLE `genero_model`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `peliculas_genero`
--
ALTER TABLE `peliculas_genero`
  ADD PRIMARY KEY (`pelicula_model_id`,`lista_generos_id`),
  ADD KEY `FKqnrybdd1oymjo2aa78gtrbojp` (`lista_generos_id`);

--
-- Indices de la tabla `pelicula_model`
--
ALTER TABLE `pelicula_model`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKevlhigp7hit9oqu5lex1i66y` (`director_id`);

--
-- Indices de la tabla `rol_model`
--
ALTER TABLE `rol_model`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuario_model`
--
ALTER TABLE `usuario_model`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_kf7anqgom4sdf0kha2ypk30vy` (`correo`),
  ADD UNIQUE KEY `UK_ixh63jbayf2hawsn1g69py4j3` (`username`),
  ADD KEY `FKgjpuqx6ku58ute6dc99g1hbed` (`rol_model_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `actor_model`
--
ALTER TABLE `actor_model`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `director_model`
--
ALTER TABLE `director_model`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `genero_model`
--
ALTER TABLE `genero_model`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `pelicula_model`
--
ALTER TABLE `pelicula_model`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `rol_model`
--
ALTER TABLE `rol_model`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `usuario_model`
--
ALTER TABLE `usuario_model`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
