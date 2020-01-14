-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 14, 2020 at 12:41 PM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `restoran`
--

-- --------------------------------------------------------

--
-- Table structure for table `menu_makanan`
--

CREATE TABLE `menu_makanan` (
  `kode_menu` int(10) NOT NULL,
  `jenis_makanan` varchar(30) NOT NULL,
  `jenis_minuman` varchar(25) NOT NULL,
  `total` varchar(15) NOT NULL,
  `nama_kasir` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `menu_makanan`
--

INSERT INTO `menu_makanan` (`kode_menu`, `jenis_makanan`, `jenis_minuman`, `total`, `nama_kasir`) VALUES
(1, 'nasi goreng', 'jus jeruk', 'Rp.30000', 'yogi'),
(2, 'mie goreng', 'teh hangat', 'Rp.15000', 'lana'),
(3, 'bubur ayam', 'susu soda', 'Rp.30000', 'dadang'),
(4, 'roti', 'teh', 'Rp.22000', 'putri'),
(5, 'nasi goreng', 'kopi', 'Rp.45000', 'cece');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `menu_makanan`
--
ALTER TABLE `menu_makanan`
  ADD PRIMARY KEY (`kode_menu`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
