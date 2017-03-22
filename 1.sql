-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Roles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Roles` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(45) NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`User` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `Login` VARCHAR(45) NULL,
  `Password` VARCHAR(45) NULL,
  `Role` INT NULL,
  PRIMARY KEY (`ID`),
  INDEX `RoleU_idx` (`Role` ASC),
  CONSTRAINT `RoleU`
    FOREIGN KEY (`Role`)
    REFERENCES `mydb`.`Roles` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Questionare`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Questionare` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(45) NULL,
  `User` INT NULL,
  PRIMARY KEY (`ID`),
  INDEX `UserQ_idx` (`User` ASC),
  CONSTRAINT `UserQ`
    FOREIGN KEY (`User`)
    REFERENCES `mydb`.`User` (`ID`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Question`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Question` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `Text` VARCHAR(45) NULL,
  `Questionare` INT NULL,
  PRIMARY KEY (`ID`),
  INDEX `QuestionareF_idx` (`Questionare` ASC),
  CONSTRAINT `QuestionareF`
    FOREIGN KEY (`Questionare`)
    REFERENCES `mydb`.`Questionare` (`ID`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Answer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Answer` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `Text` VARCHAR(45) NULL,
  `Question` INT NULL,
  PRIMARY KEY (`ID`),
  INDEX `QuestionF_idx` (`Question` ASC),
  CONSTRAINT `QuestionF`
    FOREIGN KEY (`Question`)
    REFERENCES `mydb`.`Question` (`ID`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
