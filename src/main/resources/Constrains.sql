ALTER TABLE `breed` ADD CONSTRAINT `FK_SPECIE` FOREIGN KEY (`specieId`) REFERENCES `specie`(`id`) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE `patient` ADD CONSTRAINT `FR_BREED` FOREIGN KEY (`breedId`) REFERENCES `breed`(`id`) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE `register` ADD CONSTRAINT `FK_OWNER` FOREIGN KEY (`idOwner`) REFERENCES `owner`(`id`) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE `register` ADD CONSTRAINT `FK_PATIENT` FOREIGN KEY (`idPatient`) REFERENCES `patient`(`id`) ON DELETE RESTRICT ON UPDATE RESTRICT;
