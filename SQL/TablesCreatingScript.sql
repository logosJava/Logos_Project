CREATE SCHEMA IF NOT EXISTS `University` ;
Use `University`;

CREATE TABLE IF NOT EXISTS `University`.`Faculty` (
  `idFaculty` INT NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`idFaculty`));
  
CREATE TABLE IF NOT EXISTS `University`.`Department` (
  `idDepartment` INT NOT NULL AUTO_INCREMENT,
  `IdFaculty` INT NOT NULL,
  `Name` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`idDepartment`),
  INDEX `DepartmentToFaculty_idx` (`IdFaculty` ASC),
  CONSTRAINT `DepartmentToFaculty`
    FOREIGN KEY (`IdFaculty`)
    REFERENCES `University`.`Faculty` (`idFaculty`));

CREATE TABLE IF NOT EXISTS `University`.`Students` (
  `idStudents` INT NOT NULL AUTO_INCREMENT,
  `FirstName` VARCHAR(45) NOT NULL,
  `LastName` VARCHAR(45) NOT NULL,
  `YearOfBirth` INT UNSIGNED NULL,
  `Course` INT NOT NULL,
  `IdDepartment` INT NOT NULL,
  `URlPicture` VARCHAR(300) NULL,
  PRIMARY KEY (`idStudents`),
  INDEX `StudentsToDepartments_idx` (`IdDepartment` ASC),
  CONSTRAINT `StudentsToDepartments`
    FOREIGN KEY (`IdDepartment`)
    REFERENCES `University`.`Department` (`idDepartment`));
	
CREATE TABLE IF NOT EXISTS `University`.`Teachers` (
  `idTeacher` INT NOT NULL AUTO_INCREMENT,
  `FirstName` VARCHAR(45) NOT NULL,
  `LastName` VARCHAR(45) NOT NULL,
  `YearOfBirth` INT UNSIGNED NULL,
  `Course` INT NOT NULL,
  `IdDepartment` INT NOT NULL,
  `URlPicture` VARCHAR(300) NULL,
  PRIMARY KEY (`idTeacher`),
  INDEX `TeachersToDepartment_idx` (`IdDepartment` ASC),
  CONSTRAINT `TeachersToDepartment`
    FOREIGN KEY (`IdDepartment`)
    REFERENCES `University`.`Department` (`idDepartment`));

CREATE TABLE IF NOT EXISTS `University`.`Subjects` (
  `idSubjects` INT NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(100) NOT NULL,
  `TeachersId` INT NOT NULL,
  PRIMARY KEY (`idSubjects`),
  UNIQUE INDEX `idSubjects_UNIQUE` (`idSubjects` ASC),
  UNIQUE INDEX `Name_UNIQUE` (`Name` ASC),
  INDEX `SubjectToTeacher_idx` (`TeachersId` ASC),
  CONSTRAINT `SubjectToTeacher`
    FOREIGN KEY (`TeachersId`)
    REFERENCES `University`.`Teachers` (`idTeacher`));

CREATE TABLE IF NOT EXISTS `University`.`SubjectAndCourse` (
  `idSubjectAndCourse` INT NOT NULL AUTO_INCREMENT,
  `SubjectId` INT NOT NULL,
  `Course` INT NOT NULL,
  `DepartmentId` INT NOT NULL,
  PRIMARY KEY (`idSubjectAndCourse`),
  INDEX `SubjectToSubject_idx` (`SubjectId` ASC),
  INDEX `SubjectToDepartment_idx` (`DepartmentId` ASC),
  CONSTRAINT `SubjectToSubject`
    FOREIGN KEY (`SubjectId`)
    REFERENCES `University`.`Subjects` (`idSubjects`),
  CONSTRAINT `SubjectToDepartment`
    FOREIGN KEY (`DepartmentId`)
    REFERENCES `University`.`Department` (`idDepartment`));

CREATE TABLE IF NOT EXISTS `University`.`Marks` (
  `idMarks` INT NOT NULL AUTO_INCREMENT,
  `StudentsId` INT NOT NULL,
  `SubjectId` INT NOT NULL,
  `Value` INT NOT NULL,
  PRIMARY KEY (`idMarks`),
  INDEX `MarksToStudent_idx` (`StudentsId` ASC),
  INDEX `MarksToSubject_idx` (`SubjectId` ASC),
  CONSTRAINT `MarksToStudent`
    FOREIGN KEY (`StudentsId`)
    REFERENCES `University`.`Students` (`idStudents`),
  CONSTRAINT `MarksToSubject`
    FOREIGN KEY (`SubjectId`)
    REFERENCES `University`.`Subjects` (`idSubjects`))