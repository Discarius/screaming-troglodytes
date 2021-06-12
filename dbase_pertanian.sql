-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 12, 2021 at 10:26 AM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbase_pertanian`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_tani`
--

CREATE TABLE `data_tani` (
  `nama_bibit` varchar(40) NOT NULL,
  `harga_bibit` varchar(40) NOT NULL,
  `biaya_perawatan` varchar(40) NOT NULL,
  `modal` varchar(40) NOT NULL,
  `hasil_kg` varchar(40) NOT NULL,
  `hasil_harga_kg` varchar(40) NOT NULL,
  `total_hasil` varchar(40) NOT NULL,
  `ratio_kotor` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_tani`
--
ALTER TABLE `data_tani`
  ADD UNIQUE KEY `nama_bibit` (`nama_bibit`,`harga_bibit`,`biaya_perawatan`,`modal`,`hasil_kg`,`hasil_harga_kg`,`total_hasil`,`ratio_kotor`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
