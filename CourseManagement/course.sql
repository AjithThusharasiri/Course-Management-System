-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 18, 2020 at 03:51 AM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `course`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_panel`
--

CREATE TABLE IF NOT EXISTS `admin_panel` (
  `id` int(15) NOT NULL AUTO_INCREMENT,
  `mail` varchar(80) NOT NULL,
  `password` varchar(50) NOT NULL,
  `name` varchar(60) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Dumping data for table `admin_panel`
--

INSERT INTO `admin_panel` (`id`, `mail`, `password`, `name`) VALUES
(9, 'maxajith@gmail.com', '1234', 'Ajith');

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE IF NOT EXISTS `courses` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `Name` varchar(80) NOT NULL,
  `Content` varchar(200) NOT NULL,
  `Time` int(20) NOT NULL,
  `Discription` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`id`, `Name`, `Content`, `Time`, `Discription`) VALUES
(1, 'Computer science', 'Fundermental', 8, 'Attend compulsory');

-- --------------------------------------------------------

--
-- Table structure for table `message`
--

CREATE TABLE IF NOT EXISTS `message` (
  `Id` int(20) NOT NULL AUTO_INCREMENT,
  `Message` varchar(500) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `message`
--

INSERT INTO `message` (`Id`, `Message`) VALUES
(1, 'All lectures canseled');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `id` int(200) NOT NULL AUTO_INCREMENT,
  `sname` varchar(100) NOT NULL,
  `sreg` int(10) NOT NULL,
  `sphone` int(10) NOT NULL,
  `syear` int(2) NOT NULL,
  `spassword` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `sname`, `sreg`, `sphone`, `syear`, `spassword`) VALUES
(7, 'ajith', 1233, 1211221111, 1, '1212');
