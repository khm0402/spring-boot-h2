DROP TABLE IF EXISTS TB_USER;

CREATE TABLE TB_USER (
    user_seq BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL
);