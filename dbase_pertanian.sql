-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 26, 2021 at 10:33 AM
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
  `no` int(11) NOT NULL,
  `nama_bibit` varchar(40) NOT NULL,
  `harga_bibit` int(40) NOT NULL,
  `biaya_perawatan` int(40) NOT NULL,
  `hasil_kg` int(40) NOT NULL,
  `hasil_harga_kg` int(40) NOT NULL,
  `modal` int(11) NOT NULL,
  `total_hasil` int(11) NOT NULL,
  `ratio_kotor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `data_tani`
--

INSERT INTO `data_tani` (`no`, `nama_bibit`, `harga_bibit`, `biaya_perawatan`, `hasil_kg`, `hasil_harga_kg`, `modal`, `total_hasil`, `ratio_kotor`) VALUES
(1, 'apel', 2, 3, 4, 5, 0, 0, 0),
(2, 'duku', 5, 6, 7, 8, 0, 0, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_tani`
--
ALTER TABLE `data_tani`
  ADD PRIMARY KEY (`no`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data_tani`
--
ALTER TABLE `data_tani`
  MODIFY `no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
