CREATE TABLE `Cliente` (
  `idCliente` INT NOT NULL AUTOINCREMENT,
  `nome` TEXT NOT NULL,
  `sobrenome` TEXT NOT NULL,
  `email` TEXT NOT NULL,
  `senha` TEXT NOT NULL,
  PRIMARY KEY (`idCliente`));

CREATE TABLE `AcaoHistorico` (
  `idAcaoHistorico` INT NOT NULL AUTOINCREMENT,
  `descricao` TEXT NULL,
  PRIMARY KEY (`idAcaoHistorico`));

CREATE TABLE `Evento` (
  `idEvento` INT NOT NULL AUTOINCREMENT,
  `nome` TEXT NOT NULL,
  `data` DATETIME NOT NULL,
  `preco` DECIMAL(10,2) NULL,
  `likes` INT NULL,
  `deslike` INT NULL,
  `endereco` TEXT NULL,
  `numero` INT NULL,
  `bairro` TEXT NULL,
  `cidade` TEXT NULL,
  `estado` TEXT NULL,
  `pais` TEXT NULL,
  `latitude` TEXT NULL,
  `longitude` TEXT NULL,
  PRIMARY KEY (`idEvento`));

CREATE TABLE `Historico` (
  `idHistorico` INT NOT NULL AUTOINCREMENT,
  `idCliente` INT NOT NULL,
  `idEvento` INT NOT NULL,
  `idAcaoHistorico` INT NOT NULL,
  PRIMARY KEY (`idHistorico`),
    FOREIGN KEY (`idCliente`)
    REFERENCES `Cliente` (`idCliente`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    FOREIGN KEY (`idEvento`)
    REFERENCES `Evento` (`idEvento`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    FOREIGN KEY (`IdAcaoHistorico`)
    REFERENCES `AcaoHistorico` (`idAcaoHistorico`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

CREATE TABLE `Imagem` (
  `idImagem` INT NOT NULL AUTOINCREMENT,
  `nome` TEXT NULL,
  `caminho` TEXT NULL,
  `idEvento` INT NOT NULL,
  PRIMARY KEY (`idImagem`),
    FOREIGN KEY (`idEvento`)
    REFERENCES `Evento` (`idEvento`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);
