CREATE TABLE Hotels (
id INT AUTO_INCREMENT PRIMARY KEY UNIQUE,
nameHotel VARCHAR (120) NOT NULL,
address VARCHAR (120) NOT NULL UNIQUE,
classification VARCHAR (10) NOT NULL,
mobCons VARCHAR (120) NOT NULL,
pictures VARCHAR (120) NOT NULL
)