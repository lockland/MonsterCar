﻿-- CRIADA
CREATE TABLE IF NOT EXISTS Endereco (
	id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, 
	endereco TEXT NOT NULL, 
	bairro TEXT NOT NULL, 
	cep TEXT NOT NULL, 
	cidade TEXT NOT NULL, 
	uf TEXT NOT NULL
)

-- Classe é estendida por DonoVeiculo e Funcionario
CREATE TABLE IF NOT EXISTS Cliente (
	id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
	nome TEXT NOT NULL,
	idEndereco INTEGER NOT NULL, 
	cpf TEXT NOT NULL, 
	rg TEXT NOT NULL,
	dataNasc TEXT, 
	celular TEXT NOT NULL, 
	residencial TEXT, 
	estadoCivil TEXT NOT NULL, 
	sexo TEXT NOT NULL, 
	email TEXT, 
	FOREIGN KEY (idEndereco) REFERENCES Endereco(id) ON DELETE CASCADE ON UPDATE CASCADE
)

CREATE TABLE IF NOT EXISTS Funcionario (
	id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
	idCliente INTEGER NOT NULL, 
	admissao TEXT NOT NULL, 
	demissao TEXT NOT NULL,
	ativo TEXT NOT NULL, 
	senha TEXT NOT NULL,
	salario INTEGER NOT NULL, 
	comissao INTEGER NOT NULL, 
	funcao TEXT NOT NULL, 
	FOREIGN KEY (idCliente) REFERENCES Cliente(id) ON DELETE CASCADE ON UPDATE CASCADE
)

CREATE TABLE IF NOT EXISTS Veiculo (
	id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
	idDono INTEGER NOT NULL,
	placa TEXT NOT NULL,
	renavam TEXT NOT NULL,
	modelo TEXT NOT NULL,
	cor TEXT NOT NULL,
	anoFabricacao TEXT NOT NULL,
	kmRodados INTEGER NOT NULL,
	vendido TEXT NOT NULL,
	valor INTEGER NOT NULL,
	tipo TEXT NOT NULL,
	observacoes TEXT NOT NULL,
	FOREIGN KEY (idDono) REFERENCES Cliente(id) ON DELETE CASCADE ON UPDATE CASCADE
)

CREATE TABLE IF NOT EXISTS Multa (
	id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
	idVeiculo INTEGER NOT NULL,
	descricao TEXT NOT NULL,
	valor INTEGER NOT NULL,
	vencimento TEXT NOT NULL,
	paga TEXT NOT NULL,
	FOREIGN KEY (idVeiculo) REFERENCES Veiculo(id) ON DELETE CASCADE ON UPDATE CASCADE
)

CREATE TABLE IF NOT EXISTS Manutencao (
	id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
	idVeiculo INTEGER NOT NULL,
	descricao TEXT NOT NULL,
	codComprovante TEXT NOT NULL,
	data TEXT NOT NULL,
	FOREIGN KEY (idVeiculo) REFERENCES Veiculo(id) ON DELETE CASCADE ON UPDATE CASCADE
)


CREATE TABLE IF NOT EXISTS Despachante (
    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    nome TEXT NOT NULL,
    idEndereco INTEGER NOT NULL,
    telefone TEXT NOT NULL,
    registro TEXT NOT NULL,
    FOREIGN KEY (idEndereco) REFERENCES Endereco(id) ON DELETE CASCADE ON UPDATE CASCADE
)

CREATE TABLE IF NOT EXISTS Receita (
	id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    descricao TEXT NOT NULL,
    data TEXT NOT NULL,
    valor INTEGER NOT NULL
)

CREATE TABLE IF NOT EXISTS Despesa (
	id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    descricao TEXT NOT NULL,
    data TEXT NOT NULL,
    valor INTEGER NOT NULL,
	codComprovante TEXT NOT NULL,
    categoria TEXT NOT NULL
)

CREATE TABLE IF NOT EXISTS Caixa (
	id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    saldo INTEGER NOT NULL,
    dataOpen TEXT NOT NULL,
    dataClose TEXT,
    open STRING NOT NULL
)

CREATE TABLE IF NOT EXISTS Financeira (
	id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    nomeFantasia TEXT NOT NULL,
    cnpj TEXT NOT NULL,
    idEndereco INTEGER NOT NULL,
    telefone TEXT NOT NULL,
    registro TEXT NOT NULL,
	FOREIGN KEY (idEndereco) REFERENCES Endereco(id) ON DELETE CASCADE ON UPDATE CASCADE
)

CREATE TABLE IF NOT EXISTS Gerente (
	id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
	senha TEXT NOT NULL
)

CREATE TABLE IF NOT EXISTS Venda (
	id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    idVeiculo INTEGER NOT NULL,
    idVendedor INTEGER NOT NULL,
    idCliente INTEGER NOT NULL,
    idFinanceira INTEGER NOT NULL,
    qtdParcelas INTEGER NOT NULL,
    valorParcelas INTEGER NOT NULL,
    valorTotal INTEGER NOT NULL,
    data TEXT NOT NULL,
    estado TEXT NOT NULL,
	FOREIGN KEY (idVeiculo) REFERENCES Veiculo(id) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY (idVendedor) REFERENCES Vendedor(id) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY (idCliente) REFERENCES Cliente(id) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY (idFinanceira) REFERENCES Financeira(id) ON DELETE CASCADE ON UPDATE CASCADE
)