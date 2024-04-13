-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 08, 2024 at 08:24 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `united_airlines_ramp`
--

-- --------------------------------------------------------

--
-- Table structure for table `cargo_container`
--

CREATE TABLE `cargo_container` (
  `container_id` varchar(255) NOT NULL,
  `list_id` varchar(255) NOT NULL,
  `description` text NOT NULL,
  `capacity` int(10) UNSIGNED NOT NULL,
  `damage` tinyint(1) NOT NULL,
  `status` enum('full','loading','empty','overfilled') NOT NULL,
  `lock_status` enum('locked','unlocked','other','') NOT NULL,
  `lock_img` text NOT NULL,
  `tag_img` text NOT NULL,
  `probability` float NOT NULL,
  `tag` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `checklist_team`
--

CREATE TABLE `checklist_team` (
  `id` int(100) NOT NULL,
  `employee_id` varchar(255) NOT NULL,
  `list_id` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `employee_id` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO employee (employee_id, password) VALUES ('sahil', 'sahil123');


-- --------------------------------------------------------

--
-- Table structure for table `fireline`
--

CREATE TABLE `fireline` (
  `id` int(255) NOT NULL,
  `list_id` varchar(255) NOT NULL,
  `fireline_status` tinyint(1) NOT NULL,
  `fireline_img` text NOT NULL,
  `tag_img` text NOT NULL,
  `probability` float NOT NULL,
  `tag` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `luggage`
--

CREATE TABLE `luggage` (
  `luggage_id` int(255) NOT NULL,
  `description` text NOT NULL,
  `weight` int(10) UNSIGNED NOT NULL,
  `status` enum('loaded','unloaded','not loaded','') NOT NULL,
  `container_id` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `ramp_checklist`
--

CREATE TABLE `ramp_checklist` (
  `list_id` varchar(255) NOT NULL,
  `date` datetime NOT NULL DEFAULT current_timestamp(),
  `type` enum('load','unload','','') NOT NULL,
  `flight_number` varchar(255) NOT NULL,
  `tail_number` varchar(255) NOT NULL,
  `gate` varchar(255) NOT NULL,
  `standard_clear` enum('true','false','manual') NOT NULL DEFAULT 'false',
  `safety_clear` enum('true','false','manual') NOT NULL DEFAULT 'false',
  `ppe` tinyint(1) DEFAULT NULL,
  `wheel_chocks` tinyint(1) DEFAULT NULL,
  `engines_off` tinyint(1) DEFAULT NULL,
  `no_leaks` tinyint(1) DEFAULT NULL,
  `cargo_damage` tinyint(1) DEFAULT NULL,
  `doors_secure` tinyint(1) DEFAULT NULL,
  `belt_loader_secure` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cargo_container`
--
ALTER TABLE `cargo_container`
  ADD PRIMARY KEY (`container_id`),
  ADD KEY `list_id` (`list_id`);

--
-- Indexes for table `checklist_team`
--
ALTER TABLE `checklist_team`
  ADD PRIMARY KEY (`id`),
  ADD KEY `employee_id` (`employee_id`),
  ADD KEY `list_id` (`list_id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`employee_id`);

--
-- Indexes for table `fireline`
--
ALTER TABLE `fireline`
  ADD PRIMARY KEY (`id`),
  ADD KEY `list_id` (`list_id`);

--
-- Indexes for table `luggage`
--
ALTER TABLE `luggage`
  ADD PRIMARY KEY (`luggage_id`),
  ADD KEY `container_id` (`container_id`);

----
---- Indexes for table `ramp_checklist`
----
ALTER TABLE `ramp_checklist`
  ADD PRIMARY KEY (`list_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `checklist_team`
--
ALTER TABLE `checklist_team`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `fireline`
--
ALTER TABLE `fireline`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `luggage`
--
ALTER TABLE `luggage`
    MODIFY `luggage_id` int(255) NOT NULL AUTO_INCREMENT;


--
-- Constraints for dumped tables
--

--
-- Constraints for table `cargo_container`
--
ALTER TABLE `cargo_container`
  ADD CONSTRAINT `cargo_container_ibfk_1` FOREIGN KEY (`list_id`) REFERENCES `ramp_checklist` (`list_id`);

--
-- Constraints for table `checklist_team`
--
ALTER TABLE `checklist_team`
  ADD CONSTRAINT `checklist_team_ibfk_1` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`employee_id`),
  ADD CONSTRAINT `checklist_team_ibfk_2` FOREIGN KEY (`list_id`) REFERENCES `ramp_checklist` (`list_id`);

--
-- Constraints for table `fireline`
--
ALTER TABLE `fireline`
  ADD CONSTRAINT `fireline_ibfk_1` FOREIGN KEY (`list_id`) REFERENCES `ramp_checklist` (`list_id`);

--
-- Constraints for table `luggage`
--
ALTER TABLE `luggage`
  ADD CONSTRAINT `luggage_ibfk_1` FOREIGN KEY (`container_id`) REFERENCES `cargo_container` (`container_id`);

--  ALTER TABLE `ramp_checklist`
--    CHANGE COLUMN `list_id` `list_id` INT AUTO_INCREMENT PRIMARY KEY;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
