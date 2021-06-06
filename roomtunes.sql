-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 06, 2021 at 06:30 PM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `roomtunes`
--

-- --------------------------------------------------------

--
-- Table structure for table `coupon`
--

DROP TABLE IF EXISTS `coupon`;
CREATE TABLE IF NOT EXISTS `coupon` (
  `DateStart` date NOT NULL,
  `DateEnd` date NOT NULL,
  `Discount` int(255) NOT NULL,
  `CouponUsers` int(150) NOT NULL,
  `CouponCode` varchar(150) NOT NULL,
  PRIMARY KEY (`CouponUsers`,`CouponCode`),
  KEY `CouponUsers` (`CouponUsers`)
) ENGINE=InnoDB DEFAULT CHARSET=utf16;

--
-- Dumping data for table `coupon`
--

INSERT INTO `coupon` (`DateStart`, `DateEnd`, `Discount`, `CouponUsers`, `CouponCode`) VALUES
('2021-06-06', '2022-06-06', 20, 1, 'COUPON');

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
CREATE TABLE IF NOT EXISTS `reservation` (
  `Reserver` int(255) NOT NULL,
  `RroomID` int(150) NOT NULL,
  `ReservationID` int(150) NOT NULL AUTO_INCREMENT,
  `DateOfSubmit` datetime NOT NULL,
  PRIMARY KEY (`ReservationID`),
  KEY `Reserver` (`Reserver`,`RroomID`),
  KEY `ReservationRoom_Room` (`RroomID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf16;

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
CREATE TABLE IF NOT EXISTS `room` (
  `Address` varchar(255) NOT NULL,
  `CostPerHour` int(150) NOT NULL,
  `RoomID` int(150) NOT NULL,
  `NumberOfPeople` int(150) NOT NULL,
  PRIMARY KEY (`RoomID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf16;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `FullName` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Username` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `Vip` tinyint(1) NOT NULL,
  `UserID` int(255) NOT NULL,
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf16;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`FullName`, `Email`, `Username`, `Password`, `Vip`, `UserID`) VALUES
('kwnstantinos melissourgos', 'km13km13km13@gmail.com', 'kwstasmel', '1q2w3e4r', 0, 1);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `coupon`
--
ALTER TABLE `coupon`
  ADD CONSTRAINT `UserCoupon_User` FOREIGN KEY (`CouponUsers`) REFERENCES `users` (`UserID`);

--
-- Constraints for table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `ReservationRoom_Room` FOREIGN KEY (`RroomID`) REFERENCES `room` (`RoomID`),
  ADD CONSTRAINT `Reserver_User` FOREIGN KEY (`Reserver`) REFERENCES `users` (`UserID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
