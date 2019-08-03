-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 03, 2019 at 02:07 AM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.1.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_kontrakan`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `username` varchar(64) NOT NULL,
  `password` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`) VALUES
(1, 'admin', '21232f297a57a5a743894a0e4a801fc3');

-- --------------------------------------------------------

--
-- Table structure for table `kontrakan`
--

CREATE TABLE `kontrakan` (
  `id` int(10) NOT NULL,
  `alamat` text NOT NULL,
  `tipe` varchar(10) NOT NULL,
  `nomor` int(3) NOT NULL,
  `biaya_sewa` int(9) NOT NULL,
  `tanggal_diisi` date NOT NULL,
  `available` tinyint(2) NOT NULL,
  `id_pemilik` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kontrakan`
--

INSERT INTO `kontrakan` (`id`, `alamat`, `tipe`, `nomor`, `biaya_sewa`, `tanggal_diisi`, `available`, `id_pemilik`) VALUES
(1, 'Kp Sukarajin 03/03', '32/40', 1, 1000000, '2019-08-03', 0, 1),
(2, 'Kp Sukarajin 03/03', '34/40', 2, 800000, '2019-08-03', 0, 1),
(3, 'Kp Gading Tutuka', '34/40', 3, 750000, '2019-08-03', 0, 1);

-- --------------------------------------------------------

--
-- Table structure for table `pemilik`
--

CREATE TABLE `pemilik` (
  `id` int(10) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` text NOT NULL,
  `telpon` bigint(20) NOT NULL,
  `username` varchar(32) NOT NULL,
  `password` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pemilik`
--

INSERT INTO `pemilik` (`id`, `nama`, `alamat`, `telpon`, `username`, `password`) VALUES
(1, 'Sultan', 'Kp sukarajin 03/03', 2235435423, 'sultan', '9af82031d374b97c9e73132a413cbdf5');

-- --------------------------------------------------------

--
-- Table structure for table `penyewa`
--

CREATE TABLE `penyewa` (
  `id` int(10) NOT NULL,
  `nik` bigint(20) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `telpon` bigint(20) NOT NULL,
  `daerah_asal` varchar(20) NOT NULL,
  `tanggal_mulai` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penyewa`
--

INSERT INTO `penyewa` (`id`, `nik`, `nama`, `telpon`, `daerah_asal`, `tanggal_mulai`) VALUES
(1, 1224321209890002, 'Irfan Z', 8552939102, 'Bandung', '2019-08-03'),
(2, 1200324213432, 'S Safira Nadifa', 342743512, 'Cimahi', '2019-08-03'),
(3, 4329743094322, 'Ricky Yudah P', 435342345, 'Nihon', '2019-08-03');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id` int(10) NOT NULL,
  `tanggal_transaksi` date NOT NULL,
  `id_kontrakan` int(10) NOT NULL,
  `id_penyewa` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id`, `tanggal_transaksi`, `id_kontrakan`, `id_penyewa`) VALUES
(1, '2019-08-03', 1, 1),
(2, '2019-08-03', 3, 3),
(3, '2019-08-03', 2, 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `kontrakan`
--
ALTER TABLE `kontrakan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `kontrakan_fk_1` (`id_pemilik`);

--
-- Indexes for table `pemilik`
--
ALTER TABLE `pemilik`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `penyewa`
--
ALTER TABLE `penyewa`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id`),
  ADD KEY `transaksi_fk_1` (`id_kontrakan`),
  ADD KEY `transaksi_fk_2` (`id_penyewa`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `kontrakan`
--
ALTER TABLE `kontrakan`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `pemilik`
--
ALTER TABLE `pemilik`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `penyewa`
--
ALTER TABLE `penyewa`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `kontrakan`
--
ALTER TABLE `kontrakan`
  ADD CONSTRAINT `kontrakan_fk_1` FOREIGN KEY (`id_pemilik`) REFERENCES `pemilik` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_fk_1` FOREIGN KEY (`id_kontrakan`) REFERENCES `kontrakan` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `transaksi_fk_2` FOREIGN KEY (`id_penyewa`) REFERENCES `penyewa` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
