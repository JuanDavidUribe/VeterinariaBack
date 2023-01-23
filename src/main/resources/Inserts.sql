INSERT INTO `specie` (`id`, `specieName`) VALUES ('1', 'Perro'), ('2', 'Gato'), ('3', 'Pato'), ('4', 'Ave');

INSERT INTO `breed` (`id`, `breedName`, `specieId`) VALUES ('1', 'Fox terrier', '1'), ('2', 'Pastor aleman', '1'), ('3', 'Pastor belga', '1'), ('4', 'Westie', '1'), ('5', 'Abisinio', '2'), ('6', 'Bengalí', '2'), ('7', 'Esfinge', '2'), ('8', 'Asiático', '2'), ('9', 'Kaki Campbell', '3'), ('10', 'Corredor indio atruchado', '3'), ('11', 'Perico', '4'), ('12', 'Canario', '4'), ('13', 'Loro', '4'), ('14', 'Cacatua', '4');

INSERT INTO `patient` (`id`, `birth`, `breedId`, `patientName`) VALUES ('1628', '2022-11-16', '1', 'Mishu'), ('2578', '2018-12-05', '3', 'Nacho'), ('8756', '2017-05-10', '6', 'Orion'), ('1842', '2015-02-19', '13', 'Diego'), ('7536', '2013-09-17', '4', 'Odin'), ('2038', '2021-12-02', '5', 'Violeta'), ('2975', '2015-03-06', '10', 'Patito'), ('5637', '2005-12-14', '2', 'Simba'), ('9462', '2022-08-16', '3', 'Nala'), ('4502', '2022-06-07', '11', 'Mojito');

INSERT INTO `owner` (`id`, `address`, `cellphone`, `city`, `name`, `typeId`) VALUES
('1001467812', 'Cra 50', '3014884578', 'Medellín', 'Manuel', 'Cedula ciudadanía'),
('1545014045', 'Calle 10', '3014875236', 'Medellín', 'Juan', 'Tarjeta de identidad'),
('2155359821', 'Transversal 2', '3012248754', 'Medellín', 'Laura', 'Cedula ciudadanía'),
('1548732014', 'Cra 33', '3016339851', 'Medellín', 'Luisa', 'Tarjeta de identidad'),
('1034875265', 'Cra 50', '3012459632', 'Medellín', 'Kevin', 'Cedula ciudadanía'),
('1359847521', 'Calle 21', '3012569874', 'Medellín', 'Maria Isabel', 'Tarjeta de identidad'),
('1986301452', 'Calle 20', '3012547862', 'Medellín', 'Daniel', 'Cedula ciudadanía');

INSERT INTO `register` (`idPatient`, `idOwner`, `registerDate`) VALUES
('1842', '1545014045', '2022-12-06'), ('1628', '1986301452', '2022-12-06'),
('4502', '1359847521', '2022-12-06'), ('2578', '1548732014', '2022-12-06'),
('1234', '1001467812', '2022-12-06'), ('2975', '1034875265', '2022-12-06'),
('8756', '2147483647', '2022-12-06'), ('9462', '1359847521', '2022-12-06'),
('2038', '1034875265', '2022-12-06'), ('2038', '2147483647', '2022-12-06');
