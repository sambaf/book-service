CREATE TABLE book
(
    id     BIGSERIAL PRIMARY KEY NOT NULL,
    name   VARCHAR,
    author VARCHAR,
    title  VARCHAR,
    price  FLOAT
);