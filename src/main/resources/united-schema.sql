CREATE TABLE `cargo_container` (
  `container_id` bigint NOT NULL AUTO_INCREMENT,
  `capacity` int DEFAULT NULL,
  `damage` bit(1) DEFAULT NULL,
  `description` text,
  `lock_img` varchar(255) DEFAULT NULL,
  `lock_status` varchar(255) DEFAULT NULL,
  `probability` decimal(19,2) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `tag` varchar(255) DEFAULT NULL,
  `tag_img` varchar(255) DEFAULT NULL,
  `list_id` bigint DEFAULT NULL,
  PRIMARY KEY (`container_id`),
  KEY `FK2kjociyc00cf42myqtlwv5t5g` (`list_id`),
  CONSTRAINT `FK2kjociyc00cf42myqtlwv5t5g` FOREIGN KEY (`list_id`) REFERENCES `ramp_checklist` (`list_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci





CREATE TABLE `checklist_team` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `employee_id` varchar(255) DEFAULT NULL,
  `list_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKfmwsylegtcfmp24whrqnms3on` (`employee_id`),
  KEY `FK4o9sd1ea4jqpkp8tq0fioc7vv` (`list_id`),
  CONSTRAINT `FK4o9sd1ea4jqpkp8tq0fioc7vv` FOREIGN KEY (`list_id`) REFERENCES `ramp_checklist` (`list_id`),
  CONSTRAINT `FKfmwsylegtcfmp24whrqnms3on` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci





CREATE TABLE `employee` (
  `employee_id` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci







CREATE TABLE `fire_line` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `fireline_img` varchar(255) DEFAULT NULL,
  `fireline_status` bit(1) NOT NULL,
  `probability` decimal(19,2) DEFAULT NULL,
  `tag` varchar(255) DEFAULT NULL,
  `tag_img` varchar(255) DEFAULT NULL,
  `list_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK7gep7xsv86kwkl41wsxc6v4r5` (`list_id`),
  CONSTRAINT `FK7gep7xsv86kwkl41wsxc6v4r5` FOREIGN KEY (`list_id`) REFERENCES `ramp_checklist` (`list_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci



CREATE TABLE `luggage` (
  `luggage_id` bigint NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `weight_kg` int DEFAULT NULL,
  `container_id` bigint DEFAULT NULL,
  PRIMARY KEY (`luggage_id`),
  KEY `FKokqrrk550p4yjbbnc2li0bacd` (`container_id`),
  CONSTRAINT `FKokqrrk550p4yjbbnc2li0bacd` FOREIGN KEY (`container_id`) REFERENCES `cargo_container` (`container_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci




CREATE TABLE `ramp_checklist` (
  `list_id` bigint NOT NULL AUTO_INCREMENT,
  `belt_loader_secure` bit(1) DEFAULT NULL,
  `cargo_damage` bit(1) DEFAULT NULL,
  `date` tinyblob,
  `doors_secure` bit(1) DEFAULT NULL,
  `engines_off` bit(1) DEFAULT NULL,
  `flight_number` varchar(255) DEFAULT NULL,
  `gate` varchar(255) DEFAULT NULL,
  `no_leaks` bit(1) DEFAULT NULL,
  `ppe` bit(1) DEFAULT NULL,
  `safety_clear` varchar(255) DEFAULT NULL,
  `standard_clear` varchar(255) DEFAULT NULL,
  `tail_number` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `wheel_chocks` bit(1) DEFAULT NULL,
  PRIMARY KEY (`list_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
