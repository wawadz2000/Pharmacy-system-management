-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 16, 2022 at 03:39 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pharmadb`
--

-- --------------------------------------------------------

--
-- Table structure for table `agent`
--

CREATE TABLE `agent` (
  `AgentId` int(11) NOT NULL,
  `AgentName` varchar(255) NOT NULL,
  `AgentAge` int(11) NOT NULL,
  `AgentPhone` int(11) NOT NULL,
  `AgentPass` varchar(255) NOT NULL,
  `AgentGender` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `agent`
--

INSERT INTO `agent` (`AgentId`, `AgentName`, `AgentAge`, `AgentPhone`, `AgentPass`, `AgentGender`) VALUES
(125, 'ahmed58', 18, 5413252, '153246884', 'Famele'),
(362, 'wawadz2000', 24, 5421622, '159874236', 'Male'),
(1254, 'ahmed58', 188, 5413252, '153246884', 'Male');

-- --------------------------------------------------------

--
-- Table structure for table `company`
--

CREATE TABLE `company` (
  `CompId` int(11) NOT NULL,
  `CompName` varchar(255) NOT NULL,
  `CompAd` varchar(255) NOT NULL,
  `CompExp` int(11) NOT NULL,
  `CompPhone` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `company`
--

INSERT INTO `company` (`CompId`, `CompName`, `CompAd`, `CompExp`, `CompPhone`) VALUES
(1254, 'houssem', 'bordil', 215, 516241651);

-- --------------------------------------------------------

--
-- Table structure for table `currentuser`
--

CREATE TABLE `currentuser` (
  `ID` int(11) NOT NULL,
  `Name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `medicine`
--

CREATE TABLE `medicine` (
  `MedId` int(11) NOT NULL,
  `MedName` varchar(255) NOT NULL,
  `MedPrice` int(11) NOT NULL,
  `MedQty` int(11) NOT NULL,
  `MedFab` date NOT NULL,
  `MedExp` date NOT NULL,
  `MedComp` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `agent`
--
ALTER TABLE `agent`
  ADD PRIMARY KEY (`AgentId`);

--
-- Indexes for table `company`
--
ALTER TABLE `company`
  ADD PRIMARY KEY (`CompId`);

--
-- Indexes for table `currentuser`
--
ALTER TABLE `currentuser`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `medicine`
--
ALTER TABLE `medicine`
  ADD PRIMARY KEY (`MedId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `agent`
--
ALTER TABLE `agent`
  MODIFY `AgentId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12556;

--
-- AUTO_INCREMENT for table `company`
--
ALTER TABLE `company`
  MODIFY `CompId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1255;

--
-- AUTO_INCREMENT for table `currentuser`
--
ALTER TABLE `currentuser`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `medicine`
--
ALTER TABLE `medicine`
  MODIFY `MedId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1524124;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
