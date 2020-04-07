-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 07-Abr-2020 às 23:50
-- Versão do servidor: 10.4.11-MariaDB
-- versão do PHP: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `controle_frequencia`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `controle`
--

CREATE TABLE `controle` (
  `TIA` int(20) NOT NULL,
  `Horario_Entrada` datetime NOT NULL,
  `Horario_Saida` datetime NOT NULL,
  `Nome` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `controle`
--

INSERT INTO `controle` (`TIA`, `Horario_Entrada`, `Horario_Saida`, `Nome`) VALUES
(31481948, '2020-04-07 00:00:00', '2020-10-10 00:00:00', 'Jorgee'),
(31498484, '2020-10-10 00:00:00', '2020-11-11 00:00:00', 'Jorgin'),
(31929028, '2020-06-05 19:10:05', '2020-06-07 10:10:10', 'Jorge'),
(31948596, '2020-04-04 19:30:11', '2020-04-05 19:34:11', 'Rodrigo'),
(31948598, '2020-04-07 00:00:00', '2020-10-10 00:00:00', 'Henrique'),
(31952927, '2020-04-04 10:10:12', '2020-05-05 10:15:15', 'Diego'),
(65498794, '2021-12-12 00:00:00', '2021-12-10 00:00:00', 'Thiagoo'),
(78945613, '2020-08-07 00:00:00', '2020-09-08 00:00:00', 'Matheus'),
(314654614, '2020-05-01 10:10:10', '2020-06-02 15:15:15', 'Lucas'),
(348918491, '2020-04-07 00:00:00', '2020-10-10 00:00:00', 'Bruno'),
(798465411, '2021-10-10 18:18:18', '2021-11-11 19:19:19', 'Breno');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `controle`
--
ALTER TABLE `controle`
  ADD PRIMARY KEY (`TIA`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
