-- V1__Create_user_and_task_tables.sql

CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE users (
                       id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
                       name VARCHAR(255),
                       email VARCHAR(255),
                       password VARCHAR(255)
);

CREATE TABLE tasks (
                       id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
                       user_id UUID REFERENCES users(id),
                       title VARCHAR(255),
                       description TEXT,
                       status VARCHAR(50)
);
