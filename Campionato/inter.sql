-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Mar 09, 2020 alle 11:02
-- Versione del server: 10.4.11-MariaDB
-- Versione PHP: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inter`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `rosa`
--

CREATE TABLE `rosa` (
  `Numero maglia` int(11) NOT NULL,
  `Nome` varchar(30) NOT NULL,
  `Cognome` varchar(30) NOT NULL,
  `Ruolo` varchar(15) NOT NULL,
  `Data di nascita` date NOT NULL,
  `Partite giocate` int(11) NOT NULL,
  `Gol` int(11) NOT NULL,
  `Assist` int(11) NOT NULL,
  `Cartellini G` int(11) NOT NULL,
  `Cartellini R` int(11) NOT NULL,
  `Clean Sheet` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `rosa`
--

INSERT INTO `rosa` (`Numero maglia`, `Nome`, `Cognome`, `Ruolo`, `Data di nascita`, `Partite giocate`, `Gol`, `Assist`, `Cartellini G`, `Cartellini R`, `Clean Sheet`) VALUES
(1, 'Samir', 'Handanovic', 'portiere', '1984-07-14', 21, 0, 0, 0, 0, 7),
(2, 'Diego', 'Godin', 'difensore', '1986-02-16', 16, 0, 1, 3, 0, 0),
(5, 'Roberto', 'Gagliardini', 'cetrocampista', '1994-04-07', 11, 2, 0, 2, 0, 0),
(6, 'Stefan', 'de Vrij', 'difensore', '1992-02-05', 22, 2, 1, 3, 0, 0),
(7, 'Alexis', 'Sanchez', 'attaccante', '1988-12-19', 8, 1, 1, 2, 1, 0),
(8, 'Matias', 'Vecino', 'centrocampista', '1991-08-24', 17, 2, 1, 3, 0, 0),
(9, 'Romelu', 'Lukaku', 'attaccante', '1993-05-13', 24, 17, 1, 2, 0, 0),
(10, 'Lautaro', 'Martinez', 'attaccante', '1997-08-22', 21, 11, 1, 6, 1, 0),
(11, 'Victor', 'Moses', 'centrocampista', '1990-12-12', 3, 0, 1, 0, 0, 0),
(12, 'Stefano', 'Sensi', 'centrocampista', '1995-08-05', 12, 3, 1, 2, 0, 0),
(13, 'Andrea', 'Ranocchia', 'difensore', '1988-02-16', 2, 0, 0, 1, 0, 0),
(15, 'Ashley', 'Young', 'centrocampista', '1985-07-09', 4, 1, 1, 1, 0, 0),
(18, 'Kwadwo', 'Asamoah', 'centrocampista', '1988-12-09', 8, 0, 1, 1, 0, 0),
(20, 'Borja', 'Valero', 'centrocampista', '1985-01-12', 9, 1, 0, 2, 0, 0),
(23, 'Nicolò', 'Barella', 'centrocampista', '1997-07-02', 19, 1, 3, 8, 0, 0),
(24, 'Christian', 'Eriksen', 'centrocampista', '1992-02-14', 3, 0, 0, 0, 0, 0),
(27, 'Daniele', 'Padelli', 'portiere', '1985-10-29', 3, 0, 0, 0, 0, 1),
(30, 'Sebastiano', 'Esposito', 'attacante', '2002-07-02', 6, 1, 0, 2, 0, 0),
(33, 'Danilo', 'D\'ambrosio', 'difensore', '1988-09-09', 12, 1, 0, 4, 0, 0),
(34, 'Cristiano', 'Biraghi', 'difensore', '1992-09-01', 16, 0, 3, 0, 0, 0),
(37, 'Milan', 'Skriniar', 'difensore', '1995-02-11', 23, 0, 0, 6, 0, 0),
(46, 'Tommaso', 'Berni', 'portiere', '1983-03-06', 0, 0, 0, 0, 1, 0),
(77, 'Marcelo', 'Brozovic', 'centrocampista', '1992-11-16', 22, 3, 5, 5, 0, 0),
(87, 'Antonio', 'Candreva', 'centrocampista', '1987-02-28', 19, 2, 5, 5, 0, 0),
(95, 'Alessandro', 'Bastoni', 'difensore', '1999-04-13', 13, 1, 0, 5, 0, 0);

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `rosa`
--
ALTER TABLE `rosa`
  ADD PRIMARY KEY (`Numero maglia`),
  ADD KEY `Cognome` (`Cognome`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
