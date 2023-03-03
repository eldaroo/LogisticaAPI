-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 18, 2023 at 10:32 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.0.25

--
-- Database: `logisticit`
--

-- --------------------------------------------------------
--
-- Table structure for table `orders`
--
DROP TABLE IF EXISTS `orders`;

CREATE TABLE IF NOT EXISTS `orders` (
    `id` bigint(20) NOT NULL,
    `text` varchar(255) NOT NULL,
    `deliveryDate` DATE DEFAULT NULL,
    `origin` varchar(50) DEFAULT NULL,
    `state` varchar(15) DEFAULT NULL,
    `delivery` varchar(25) DEFAULT NULL,
    `destination` varchar(50) DEFAULT NULL,
    `recibes` varchar(25) DEFAULT NULL,
    `phoneRecibes` int(10) DEFAULT NULL,
    `bundle` varchar(50) DEFAULT NULL,
    `missing` varchar(90) DEFAULT NULL,
    `observations` varchar(100) DEFAULT NULL,
    `deliveryObservations` varchar(90) DEFAULT NULL,
    `logistic` varchar(90) DEFAULT NULL,
    `usersId` int(11) DEFAULT NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Table structure for table `user_seq`
--
DROP TABLE IF EXISTS `orders_seq`;
CREATE TABLE IF NOT EXISTS `orders_seq` (
    `next_val` bigint(20) DEFAULT NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


--
-- Table structure for table `user`
--
DROP TABLE IF EXISTS `user`;

CREATE TABLE IF NOT EXISTS `user` (
                        `id` bigint(20) NOT NULL,
                        `email` varchar(50) NOT NULL,
                        `username` varchar(50) NOT NULL,
                        `password` varchar(255) NOT NULL,
                        `roles` varchar(255) NOT NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Table structure for table `user_seq`
--
DROP TABLE IF EXISTS `user_seq`;
CREATE TABLE IF NOT EXISTS `user_seq` (
    `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


--
-- Indexes for table `user`
--
ALTER TABLE `user`
    ADD PRIMARY KEY (`id`);

--
-- Indexes for table `order`
--
ALTER TABLE `orders`
    ADD PRIMARY KEY (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
