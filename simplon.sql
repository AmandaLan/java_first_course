-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 17, 2022 at 09:33 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `simplon`
--

-- --------------------------------------------------------

--
-- Table structure for table `apprenant`
--

CREATE TABLE `apprenant` (
  `id` varchar(255) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `adress` varchar(255) NOT NULL,
  `mail` varchar(255) NOT NULL,
  `tel` varchar(255) NOT NULL,
  `competence` varchar(255) NOT NULL,
  `idFormation` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `apprenant`
--

INSERT INTO `apprenant` (`id`, `nom`, `prenom`, `adress`, `mail`, `tel`, `competence`, `idFormation`) VALUES
('003', 'TICIPE', 'Jean', '66 rue de la formation Paris', 'ticipt@gmail.com', '02 56 90 56 54', 'HTML, CSS', '002'),
('004', 'PESTE', 'Jean', '26 rue fruit Lille', 'peste@gmail.Com', '06 58 24 59 24', 'HTML, CSS, JAVA', '003');

-- --------------------------------------------------------

--
-- Table structure for table `formation`
--

CREATE TABLE `formation` (
  `id` varchar(255) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `theme` varchar(255) NOT NULL,
  `cap` varchar(255) NOT NULL,
  `reasp_ped` varchar(255) NOT NULL,
  `date_debut` date NOT NULL,
  `date_fin` date NOT NULL,
  `idSiege` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `formation`
--

INSERT INTO `formation` (`id`, `nom`, `theme`, `cap`, `reasp_ped`, `date_debut`, `date_fin`, `idSiege`) VALUES
('001', 'POEI JAVA #2 Capgémini', 'Java', 'Camille LIESSE', 'Gülcan ACIK', '2022-02-02', '2022-04-02', '001'),
('002', 'Formation Dot.net ', 'Dot.net', 'Joris le fabuleux', 'Poupoune le généreux', '2022-02-03', '2022-04-15', '002'),
('003', 'Développeur web', 'HTML, CSS', 'Jean NAYMARRE', 'Jean CHARME', '2022-02-19', '2022-06-10', '001'),
('004', 'test', 'Java', 'Jean VOEUX', 'Cerbelin', '2004-01-22', '2050-01-22', '001');

-- --------------------------------------------------------

--
-- Table structure for table `siege`
--

CREATE TABLE `siege` (
  `id` varchar(255) NOT NULL,
  `directeur` varchar(255) NOT NULL,
  `adresse` varchar(255) NOT NULL,
  `formateur` varchar(255) NOT NULL,
  `nom` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `siege`
--

INSERT INTO `siege` (`id`, `directeur`, `adresse`, `formateur`, `nom`) VALUES
('001', 'Guillaume Trouille', '47 rue BD 56800 Lille', 'Benbahlouli Nahim', 'Simplon Lille'),
('002', 'Joris Poupoune', '26 boulevard de Paris', 'Poupoune Joris', 'Simplon Paris');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `apprenant`
--
ALTER TABLE `apprenant`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_apprenant_formation` (`idFormation`);

--
-- Indexes for table `formation`
--
ALTER TABLE `formation`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_formation_siege` (`idSiege`);

--
-- Indexes for table `siege`
--
ALTER TABLE `siege`
  ADD PRIMARY KEY (`id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `apprenant`
--
ALTER TABLE `apprenant`
  ADD CONSTRAINT `FK_apprenant_formation` FOREIGN KEY (`idFormation`) REFERENCES `formation` (`id`);

--
-- Constraints for table `formation`
--
ALTER TABLE `formation`
  ADD CONSTRAINT `FK_formation_siege` FOREIGN KEY (`idSiege`) REFERENCES `siege` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
