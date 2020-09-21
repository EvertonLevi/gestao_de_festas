DROP TABLE IF EXISTS convidado;

CREATE TABLE convidado
(
    id INTEGER PRIMARY KEY NOT NULL,
    nome VARCHAR (50),
    quantidadeDeAcompanhante INTEGER NOT NULL
);