-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 25, 2023 at 07:28 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `testing`
--

-- --------------------------------------------------------

--
-- Table structure for table `user_login`
--

CREATE TABLE `user_login` (
  `user_id` int(11) NOT NULL,
  `fullname` varchar(255) NOT NULL,
  `user_email` varchar(100) NOT NULL,
  `user_password` varchar(100) NOT NULL,
  `createdAt` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_login`
--

INSERT INTO `user_login` (`user_id`, `fullname`, `user_email`, `user_password`, `createdAt`) VALUES
(1, '', 'johnsmith@gmail.com', 'password', ''),
(2, '', 'peterparker@gmail.com', 'password', ''),
(21, '', 'adadadad', '$2b$08$aC2spStYmfMjJIz54FxUp.NQIubq46xTo52Lxb785oGta/drT1zo6', ''),
(22, '', 'sad', '$2b$08$MBWBDO5RCZjqOEjVdshNeO0DcOkp3Idog9wAh6gQ4di.c8vW9Ikaa', ''),
(23, '', 'asaasasa', '$2b$08$X4ctocEnIBspDvPtmxRj5u74Wgn7nx5pmDO5NQkS7EgvtvPfNquS2', ''),
(24, 'yahya', 'assaas', '$2b$08$tLLtLies6e0mEb5lLVeJPe.JZzvh25k8dOl6vS77fQlYEDpDK.CPK', '2023-05-21T12:50:35.183Z');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user_login`
--
ALTER TABLE `user_login`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user_login`
--
ALTER TABLE `user_login`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
