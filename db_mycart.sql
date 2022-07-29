-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 29, 2022 at 08:06 AM
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
-- Database: `db_mycart`
--

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

CREATE TABLE `cart` (
  `Nomor` int(11) NOT NULL,
  `Nama` varchar(50) DEFAULT NULL,
  `Kategori` varchar(50) DEFAULT NULL,
  `Jumlah` int(11) DEFAULT NULL,
  `Harga` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `produk`
--

CREATE TABLE `produk` (
  `Nomor` int(50) NOT NULL,
  `Kategori` varchar(50) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Harga` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `produk`
--

INSERT INTO `produk` (`Nomor`, `Kategori`, `Nama`, `Harga`) VALUES
(111, 'makanan', 'chitato', 12000),
(112, 'makanan', 'Indomie', 3000),
(113, 'makanan', 'Yupi', 8500),
(114, 'makanan', 'Sponge', 10000),
(115, 'makanan', 'Pronas', 24000),
(116, 'makanan', 'Oreo', 7000),
(117, 'makanan', 'Twister', 34000),
(118, 'makanan', 'Khong Guan', 44950),
(119, 'makanan', 'Koko Krunch', 44000),
(120, 'makanan', 'Garuda Rosta', 8500),
(121, 'makanan', 'Prochiz', 15700),
(122, 'makanan', 'Gekikara Ramen', 7000),
(123, 'makanan', 'Kanzler Sosis Single', 9090),
(124, 'makanan', 'Bagelen Vanilla', 16200),
(125, 'makanan', 'Beras Setra Ramos', 59900),
(126, 'makanan', 'Inaco Mini Jelly', 14500),
(127, 'makanan', 'Glico Haku', 5000),
(128, 'makanan', 'Patori Choco Roll', 7000),
(129, 'makanan', 'Kraft Single Cheese', 21900),
(130, 'makanan', 'Tango', 15300),
(131, 'makanan', 'Mujigae Topokki', 21200),
(132, 'makanan', 'Kanzler Bokwurst', 56990),
(133, 'makanan', 'Bakmi Mewah', 16490),
(134, 'makanan', 'Momogi', 16470),
(135, 'makanan', 'Crispy Crackers', 10790),
(136, 'makanan', 'Nabati Bites', 13900),
(137, 'makanan', 'Gaga', 10900),
(138, 'makanan', 'Ghost Pepper Noodle', 16000),
(139, 'makanan', 'Del Monte Sardines', 24090),
(140, 'makanan', 'Monde Bourbon Choco', 10390),
(141, 'makanan', 'Kraft Cheese Cheddar', 26500),
(142, 'makanan', 'Tuna Kaleng', 22000),
(143, 'makanan', 'Morin Peanut Butter', 53990),
(144, 'makanan', 'Crunchy Chocolate Bar', 10490),
(145, 'makanan', 'Bagelen Cheese', 17700),
(146, 'makanan', 'So Nice Chicken Stick', 34990),
(147, 'makanan', 'Gaga', 10900),
(148, 'makanan', 'Beef Burger Patties', 30990),
(149, 'makanan', 'Happy Tos', 21980),
(150, 'makanan', 'Bon Cabe', 11700),
(211, 'minuman', 'Aqua 600 ml', 6400),
(212, 'minuman', 'Aqua 1500 ml', 11500),
(213, 'minuman', 'Le Minerale', 12800),
(214, 'minuman', 'Greenfields 1000 ml', 23600),
(215, 'minuman', 'Frisian Flag 225 ml', 9400),
(216, 'minuman', 'Ultra Milk 125 ml', 3400),
(217, 'minuman', 'Indomilk 950 ml', 18900),
(218, 'minuman', 'Ultra Milk 200 ml', 5300),
(219, 'minuman', 'Ultra Milk 1000 ml', 19500),
(220, 'minuman', 'Frisian Flag 900 ml', 19600),
(221, 'minuman', 'NU Milk tea', 7300),
(222, 'minuman', 'Ultra Milk 250 ml', 6400),
(223, 'minuman', 'Teh Kotak', 7400),
(224, 'minuman', 'Cap Panda', 5900),
(225, 'minuman', 'Luwak White Koffie', 14000),
(226, 'minuman', 'Paldo', 30990),
(227, 'minuman', 'Super O2', 10000),
(228, 'minuman', 'Ultra Sari Kacang Hijau', 9600),
(229, 'minuman', 'Duta', 10290),
(230, 'minuman', 'You C 1000', 14900),
(231, 'minuman', 'Olatte', 10190),
(232, 'minuman', 'Fruit Tea', 6600),
(233, 'minuman', 'Fibe Mini', 13500),
(234, 'minuman', 'Adem Sari Chin Ku', 8200),
(235, 'minuman', 'Morinaga', 5400),
(236, 'minuman', 'Red Bull', 8700),
(237, 'minuman', 'Bintang Zero', 18000),
(238, 'minuman', 'Sunquick', 28990),
(239, 'minuman', 'Cap Kaki Tiga', 7700),
(240, 'minuman', 'Big Cola', 15990),
(241, 'minuman', 'Hometown', 19300),
(242, 'minuman', 'Floridina', 6900),
(243, 'minuman', 'Mony', 5000),
(244, 'minuman', 'Oran C', 10500),
(245, 'minuman', 'REALFIT', 38990),
(246, 'minuman', 'Isoplus', 6000),
(247, 'minuman', 'Fanta', 30980),
(248, 'minuman', 'Pocari Sweat', 9900),
(249, 'minuman', 'Teh Gelas', 2600),
(250, 'minuman', 'Ichitan Thai Milk Tea', 8200),
(311, 'kesehatan', 'Antangin', 17900),
(312, 'kesehatan', 'Amunizer', 8400),
(313, 'kesehatan', 'Betadine Mouthwash', 41500),
(314, 'kesehatan', 'Saniter', 16500),
(315, 'kesehatan', 'IKA alcohol 70%', 21500),
(316, 'kesehatan', 'SOS', 26400),
(317, 'kesehatan', 'HIT', 30100),
(318, 'kesehatan', 'PROMAG', 9900),
(319, 'kesehatan', 'Obat Konstipasi', 6900),
(320, 'kesehatan', 'INSTO', 13800),
(321, 'kesehatan', 'Microlax', 21000),
(322, 'kesehatan', 'Dulcolax', 6900),
(323, 'kesehatan', 'Konidin', 4500),
(324, 'kesehatan', 'Vicks', 11600),
(325, 'kesehatan', 'NEO Rheumacyl', 4500),
(326, 'kesehatan', 'Ambeven', 21100),
(327, 'kesehatan', 'BODREX', 9100),
(328, 'kesehatan', 'SILADEX', 14900),
(329, 'kesehatan', 'ROHTO', 18500),
(330, 'kesehatan', 'TERMOREX', 15000),
(331, 'kesehatan', 'Combatrin', 19800),
(332, 'kesehatan', 'WOODS', 21000),
(333, 'kesehatan', 'Counterpain', 46500),
(334, 'kesehatan', 'Actifed', 52900),
(335, 'kesehatan', 'NEO ENTROSTOP', 8000),
(336, 'kesehatan', 'ANTIMO', 5000),
(337, 'kesehatan', 'Mylanta', 13500),
(338, 'kesehatan', 'OB Herbal', 6900),
(339, 'kesehatan', 'Mixagrip', 4000),
(340, 'kesehatan', 'Saridon', 10400),
(341, 'kesehatan', 'KOMIX', 10500),
(342, 'kesehatan', 'POLYSILANE', 7900),
(343, 'kesehatan', 'PARAMEX', 2500),
(344, 'kesehatan', 'Combatrin', 17900),
(345, 'kesehatan', 'Benadryl', 23900),
(346, 'kesehatan', 'HOT IN CREAM', 3000),
(347, 'kesehatan', 'BINTANG TOEDJOE', 14000),
(348, 'kesehatan', 'Derma Angel', 19900),
(349, 'kesehatan', 'Fatigon', 4500),
(350, 'kesehatan', 'Hansaplast', 6500),
(411, 'kosmetik', 'Poise Facial Foam', 25500),
(412, 'kosmetik', 'Tessa', 19900),
(413, 'kosmetik', 'Gaenier Whip Foam', 32500),
(414, 'kosmetik', 'Viva Face Tonic', 8500),
(415, 'kosmetik', 'Maybelline Sensationl Liquid Matte', 28500),
(416, 'kosmetik', 'Maybelline Blend Brow Pencil', 59000),
(417, 'kosmetik', 'Maybelline Line Tatto', 75000),
(418, 'kosmetik', 'Poise Day Cream', 17500),
(419, 'kosmetik', 'Garnier Men Turbo Light', 33700),
(420, 'kosmetik', 'Garnier Micellar Water Rose', 37300),
(421, 'kosmetik', 'Rojukiss', 19100),
(422, 'kosmetik', 'EMINA', 17300),
(423, 'kosmetik', 'Wardah', 26900),
(424, 'kosmetik', 'PIXY', 23900),
(425, 'kosmetik', 'PASEO Facial Tissue', 20900),
(426, 'kosmetik', 'Nice Facial Tissue', 8900),
(427, 'kosmetik', 'PONDS Facial Foam', 19500),
(428, 'kosmetik', 'Acnes Creamy Wash', 30500),
(429, 'kosmetik', 'Biora Cleansing', 14000),
(430, 'kosmetik', 'Wardah Lip Cream', 62800),
(431, 'kosmetik', 'Tessa Facial Tissue', 6500),
(432, 'kosmetik', 'Multi Facial Tissue', 12800),
(433, 'kosmetik', 'SIS2SIS', 19500),
(434, 'kosmetik', 'LOREAL UV Defender', 51500),
(435, 'kosmetik', 'SARIAYU Facial Foam', 18500),
(436, 'kosmetik', 'Safi Ultimate Bright', 39500),
(437, 'kosmetik', 'Wardah Aloe Gel', 79900),
(438, 'kosmetik', 'Wardah Lightening Day & Night', 22500),
(439, 'kosmetik', 'Wardah Lightening Gentle Wash', 16500),
(440, 'kosmetik', 'Garnier Light Complete Foam', 31300);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`Nomor`);

--
-- Indexes for table `produk`
--
ALTER TABLE `produk`
  ADD PRIMARY KEY (`Nomor`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cart`
--
ALTER TABLE `cart`
  MODIFY `Nomor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=58;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
