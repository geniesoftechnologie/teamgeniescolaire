-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  lun. 05 août 2019 à 16:50
-- Version du serveur :  10.1.38-MariaDB
-- Version de PHP :  7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `scolarite`
--

-- --------------------------------------------------------

--
-- Structure de la table `annee_scolaire`
--

CREATE TABLE `annee_scolaire` (
  `ida` int(11) NOT NULL,
  `annee_sco` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `annee_scolaire`
--

INSERT INTO `annee_scolaire` (`ida`, `annee_sco`) VALUES
(1, '2018-2019'),
(2, '2017-2018');

-- --------------------------------------------------------

--
-- Structure de la table `bulletin`
--

CREATE TABLE `bulletin` (
  `id` int(4) NOT NULL,
  `id_etu` int(4) NOT NULL,
  `nom` varchar(25) NOT NULL,
  `prenom` varchar(25) NOT NULL,
  `classe` varchar(50) NOT NULL,
  `filiere` varchar(50) NOT NULL,
  `annee` varchar(50) NOT NULL,
  `semestre` varchar(50) NOT NULL,
  `java` float DEFAULT NULL,
  `langc` float DEFAULT NULL,
  `php` float DEFAULT NULL,
  `sys` float DEFAULT NULL,
  `math` float DEFAULT NULL,
  `reseau` float DEFAULT NULL,
  `somme` float DEFAULT NULL,
  `moy` float DEFAULT NULL,
  `etat` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `bulletin`
--

INSERT INTO `bulletin` (`id`, `id_etu`, `nom`, `prenom`, `classe`, `filiere`, `annee`, `semestre`, `java`, `langc`, `php`, `sys`, `math`, `reseau`, `somme`, `moy`, `etat`) VALUES
(13, 5, 'Bah', 'Ali', '1ereAnnee', 'Analyse programmation', '2018-2019', 'Item 1', 10, 10, 10, 7, 7, 4, 48, 8, 'echoue'),
(15, 6, 'Dialla', 'Fanta', '1ereAnnee', 'Analyse programmation', '2018-2019', 'S1', 88, 11, 22, 22, 22, 22, 187, 31, 'passe');

-- --------------------------------------------------------

--
-- Structure de la table `classes`
--

CREATE TABLE `classes` (
  `idc` int(5) NOT NULL,
  `idf` int(5) NOT NULL,
  `nomF` varchar(50) NOT NULL,
  `libelleC` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `classes`
--

INSERT INTO `classes` (`idc`, `idf`, `nomF`, `libelleC`) VALUES
(4, 3, 'Analyse programmation', '1ereAnnee'),
(5, 3, 'Analyse programmation', '2iemeAnnee'),
(6, 6, 'Energie renouvelable', '4iemeAnne');

-- --------------------------------------------------------

--
-- Structure de la table `depense`
--

CREATE TABLE `depense` (
  `id` int(11) NOT NULL,
  `motif` varchar(25) DEFAULT NULL,
  `montant` int(11) DEFAULT NULL,
  `dated` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `etatetudiant`
--

CREATE TABLE `etatetudiant` (
  `id` int(11) NOT NULL,
  `nom` varchar(25) NOT NULL,
  `prenom` varchar(25) NOT NULL,
  `classe` varchar(25) DEFAULT NULL,
  `filiere` varchar(25) DEFAULT NULL,
  `paiement` int(11) NOT NULL,
  `Dette` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `etatetudiant`
--

INSERT INTO `etatetudiant` (`id`, `nom`, `prenom`, `classe`, `filiere`, `paiement`, `Dette`) VALUES
(17, 'Sidibe', 'Moussa', '4iemeAnne', 'Analyse programmation', 3310000, -1510000),
(18, 'diarra', 'ousmane', '1ereAnnee', 'Miage', 100000, 550000),
(19, 'Cisse', 'Ibrahim', '1ereAnnee', 'Analyse programmation', 100000, 800000);

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

CREATE TABLE `etudiant` (
  `id` int(11) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `sexe` varchar(2) NOT NULL,
  `date_naiss` date NOT NULL,
  `phone` varchar(20) NOT NULL,
  `adresse` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `etudiant`
--

INSERT INTO `etudiant` (`id`, `nom`, `prenom`, `sexe`, `date_naiss`, `phone`, `adresse`) VALUES
(17, 'Sidibe', 'Moussa', 'M', '2019-07-04', '77-77-77-77', 'Banankabougou'),
(18, 'diarra', 'ousmane', 'M', '2019-07-04', '88-56-84-75', 'Yirimadio'),
(19, 'Cisse', 'Ibrahim', 'M', '2019-08-01', '77-77-77-77', 'kalaban');

-- --------------------------------------------------------

--
-- Structure de la table `filiere`
--

CREATE TABLE `filiere` (
  `idf` int(11) NOT NULL,
  `lib` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `filiere`
--

INSERT INTO `filiere` (`idf`, `lib`) VALUES
(3, 'Analyse programmation'),
(4, 'Finance compta'),
(5, 'Miage'),
(6, 'Energie renouvelable');

-- --------------------------------------------------------

--
-- Structure de la table `frais_academique`
--

CREATE TABLE `frais_academique` (
  `idf_a` int(11) NOT NULL,
  `montant` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `frais_academique`
--

INSERT INTO `frais_academique` (`idf_a`, `montant`) VALUES
(2, 900000),
(3, 650000);

-- --------------------------------------------------------

--
-- Structure de la table `frais_inscription`
--

CREATE TABLE `frais_inscription` (
  `idf_i` int(11) NOT NULL,
  `montant` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `frais_inscription`
--

INSERT INTO `frais_inscription` (`idf_i`, `montant`) VALUES
(1, 100000);

-- --------------------------------------------------------

--
-- Structure de la table `inscription`
--

CREATE TABLE `inscription` (
  `id` int(11) NOT NULL,
  `id_etu` int(11) NOT NULL,
  `nom` varchar(15) NOT NULL,
  `prenom` varchar(25) NOT NULL,
  `classe` varchar(25) NOT NULL,
  `filiere` varchar(25) NOT NULL,
  `annee` varchar(25) NOT NULL,
  `fraisIns` int(10) NOT NULL,
  `fraisAca` int(10) NOT NULL,
  `dateIns` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `inscription`
--

INSERT INTO `inscription` (`id`, `id_etu`, `nom`, `prenom`, `classe`, `filiere`, `annee`, `fraisIns`, `fraisAca`, `dateIns`) VALUES
(6, 19, 'Cisse', 'Ibrahim', '1ereAnnee', 'Analyse programmation', '2018-2019', 100000, 900000, '2019-08-01'),
(7, 17, 'Sidibe', 'Moussa', '4iemeAnne', 'Analyse programmation', '2018-2019', 100000, 900000, '2019-07-04'),
(8, 18, 'diarra', 'ousmane', '1ereAnnee', 'Miage', '2018-2019', 100000, 650000, '2019-07-04');

-- --------------------------------------------------------

--
-- Structure de la table `paiement`
--

CREATE TABLE `paiement` (
  `id` int(5) NOT NULL,
  `id_etu` int(5) NOT NULL,
  `nom` varchar(25) NOT NULL,
  `prenom` varchar(25) NOT NULL,
  `classe` varchar(25) NOT NULL,
  `filiere` varchar(25) NOT NULL,
  `annee` varchar(25) NOT NULL,
  `montant` int(10) NOT NULL,
  `dateIns` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `paiement`
--

INSERT INTO `paiement` (`id`, `id_etu`, `nom`, `prenom`, `classe`, `filiere`, `annee`, `montant`, `dateIns`) VALUES
(4, 17, 'aaa', 'aaa', '1ereAnnee', 'Analyse programmation', '2018-2019', 250000, '2019-07-04'),
(5, 17, 'aaa', 'aaa', '1ereAnnee', 'Analyse programmation', '2018-2019', 300000, '2019-07-04'),
(6, 17, 'aaa', 'aaa', '1ereAnnee', 'Analyse programmation', '2018-2019', 2000000, '2019-07-04'),
(7, 17, 'aaa', 'aaa', '1ereAnnee', 'Analyse programmation', '2018-2019', 55000, '2019-07-04'),
(8, 17, 'aaa', 'aaa', '1ereAnnee', 'Analyse programmation', '2018-2019', 5000, '2019-07-04'),
(9, 17, 'aaa', 'aaa', '1ereAnnee', 'Analyse programmation', '2018-2019', 100000, '2019-07-11'),
(10, 17, 'aaa', 'aaa', '1ereAnnee', 'Analyse programmation', '2018-2019', 400000, '2019-07-04');

-- --------------------------------------------------------

--
-- Structure de la table `vendeur`
--

CREATE TABLE `vendeur` (
  `idv` int(11) NOT NULL,
  `nom` varchar(25) DEFAULT NULL,
  `prenom` varchar(25) DEFAULT NULL,
  `login` varchar(25) DEFAULT NULL,
  `pasword` varchar(25) DEFAULT NULL,
  `profil` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `vendeur`
--

INSERT INTO `vendeur` (`idv`, `nom`, `prenom`, `login`, `pasword`, `profil`) VALUES
(12, 'Doumbia', 'Issa', 'Agent', '123456', 'Agent'),
(13, 'TELLY', 'Guindo', 'Agent', '123456', 'Agent');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `annee_scolaire`
--
ALTER TABLE `annee_scolaire`
  ADD PRIMARY KEY (`ida`);

--
-- Index pour la table `bulletin`
--
ALTER TABLE `bulletin`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `classes`
--
ALTER TABLE `classes`
  ADD PRIMARY KEY (`idc`);

--
-- Index pour la table `depense`
--
ALTER TABLE `depense`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `etatetudiant`
--
ALTER TABLE `etatetudiant`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `etudiant`
--
ALTER TABLE `etudiant`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `filiere`
--
ALTER TABLE `filiere`
  ADD PRIMARY KEY (`idf`);

--
-- Index pour la table `frais_academique`
--
ALTER TABLE `frais_academique`
  ADD PRIMARY KEY (`idf_a`);

--
-- Index pour la table `frais_inscription`
--
ALTER TABLE `frais_inscription`
  ADD PRIMARY KEY (`idf_i`);

--
-- Index pour la table `inscription`
--
ALTER TABLE `inscription`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `paiement`
--
ALTER TABLE `paiement`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `vendeur`
--
ALTER TABLE `vendeur`
  ADD PRIMARY KEY (`idv`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `annee_scolaire`
--
ALTER TABLE `annee_scolaire`
  MODIFY `ida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `bulletin`
--
ALTER TABLE `bulletin`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT pour la table `classes`
--
ALTER TABLE `classes`
  MODIFY `idc` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT pour la table `depense`
--
ALTER TABLE `depense`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `etudiant`
--
ALTER TABLE `etudiant`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT pour la table `filiere`
--
ALTER TABLE `filiere`
  MODIFY `idf` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `frais_academique`
--
ALTER TABLE `frais_academique`
  MODIFY `idf_a` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `frais_inscription`
--
ALTER TABLE `frais_inscription`
  MODIFY `idf_i` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `inscription`
--
ALTER TABLE `inscription`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT pour la table `paiement`
--
ALTER TABLE `paiement`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT pour la table `vendeur`
--
ALTER TABLE `vendeur`
  MODIFY `idv` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
