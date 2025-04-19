
CREATE TABLE Funcionario (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    bi VARCHAR(50) UNIQUE NOT NULL,
    cargo VARCHAR(50),
    salario DECIMAL(10, 2),
    data_admissao DATE,
    faltas INT DEFAULT 0,
    tipo ENUM('DocenteTempoIntegral', 'DocenteTempoParcial', 'TecnicoAdministrativo') NOT NULL
);


CREATE TABLE Docente (
    id INT PRIMARY KEY,
    departamento VARCHAR(100),
    FOREIGN KEY (id) REFERENCES Funcionario(id) ON DELETE CASCADE
);


CREATE TABLE DocenteTempoIntegral (
    id INT PRIMARY KEY,
    salario_fixo DECIMAL(10, 2),
    FOREIGN KEY (id) REFERENCES Docente(id) ON DELETE CASCADE
);


CREATE TABLE DocenteTempoParcial (
    id INT PRIMARY KEY,
    valor_hora DECIMAL(10, 2),
    horas_trabalhadas DECIMAL(10, 2),
    FOREIGN KEY (id) REFERENCES Docente(id) ON DELETE CASCADE
);


CREATE TABLE TecnicoAdministrativo (
    id INT PRIMARY KEY,
    setor VARCHAR(100),
    FOREIGN KEY (id) REFERENCES Funcionario(id) ON DELETE CASCADE
);
