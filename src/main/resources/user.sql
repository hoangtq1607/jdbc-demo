create database IF NOT EXISTS jdbc_test;
use jdbc_test;

create table if not exists account_user
(
    user_id     int primary key auto_increment,
    full_name   varchar(255)               not null,
    email       varchar(255)               not null unique,
    password    varchar(255)               not null,
    role        enum ('ADMIN', 'EMPLOYEE') not null default 'EMPLOYEE',
    exp_in_year tinyint,
    pro_skill   varchar(255)
);

INSERT INTO jdbc_test.account_user (user_id, full_name, email, password, role, exp_in_year, pro_skill) VALUES (1, 'Didi Motten', 'dmotten0@utexas.edu', 'AQHGlC4mm', 'ADMIN', 14, null);
INSERT INTO jdbc_test.account_user (user_id, full_name, email, password, role, exp_in_year, pro_skill) VALUES (2, 'Millicent Gover', 'mgover1@marketwatch.com', 'lW4BtL3RwVYO', 'ADMIN', 9, null);
INSERT INTO jdbc_test.account_user (user_id, full_name, email, password, role, exp_in_year, pro_skill) VALUES (3, 'Guglielmo Danks', 'gdanks2@ted.com', 'narIqY7', 'EMPLOYEE', null, 'java, sql');
INSERT INTO jdbc_test.account_user (user_id, full_name, email, password, role, exp_in_year, pro_skill) VALUES (4, 'Carin Shenley', 'cshenley3@oakley.com', 'up7lRWK', 'EMPLOYEE', null, 'java, sql');
INSERT INTO jdbc_test.account_user (user_id, full_name, email, password, role, exp_in_year, pro_skill) VALUES (5, 'Harrietta Haycox', 'hhaycox4@cbslocal.com', '4spgsCvi', 'ADMIN', 6, null);
INSERT INTO jdbc_test.account_user (user_id, full_name, email, password, role, exp_in_year, pro_skill) VALUES (6, 'Brendis Johanchon', 'bjohanchon5@yolasite.com', 'mHx47a', 'EMPLOYEE', null, 'java, sql');
INSERT INTO jdbc_test.account_user (user_id, full_name, email, password, role, exp_in_year, pro_skill) VALUES (7, 'Antonin Yurocjkin', 'ayurocjkin6@nps.gov', 'EjwfRB04meDi', 'EMPLOYEE', null, 'java, sql');
INSERT INTO jdbc_test.account_user (user_id, full_name, email, password, role, exp_in_year, pro_skill) VALUES (8, 'Alene Jiggen', 'ajiggen7@acquirethisname.com', 'kHnIKNdi', 'EMPLOYEE', null, 'java, sql');
INSERT INTO jdbc_test.account_user (user_id, full_name, email, password, role, exp_in_year, pro_skill) VALUES (9, 'Chic Sandle', 'csandle8@fda.gov', 'RIXOyiB', 'EMPLOYEE', null, 'java, sql');
INSERT INTO jdbc_test.account_user (user_id, full_name, email, password, role, exp_in_year, pro_skill) VALUES (10, 'Lanny Kinnoch', 'lkinnoch9@freewebs.com', 'TIqoFR', 'EMPLOYEE', null, 'java, sql');
INSERT INTO jdbc_test.account_user (user_id, full_name, email, password, role, exp_in_year, pro_skill) VALUES (11, 'Zebulen Casol', 'zcasola@virginia.edu', '09L415qRPz4', 'EMPLOYEE', null, 'java, sql');
INSERT INTO jdbc_test.account_user (user_id, full_name, email, password, role, exp_in_year, pro_skill) VALUES (12, 'Jeannine Tupie', 'jtupieb@drupal.org', 'xEe7jEaRW', 'EMPLOYEE', null, 'java, sql');
INSERT INTO jdbc_test.account_user (user_id, full_name, email, password, role, exp_in_year, pro_skill) VALUES (13, 'Odelle Pearsey', 'opearseyc@istockphoto.com', 'glVdCN5nb', 'EMPLOYEE', null, 'java, sql');
INSERT INTO jdbc_test.account_user (user_id, full_name, email, password, role, exp_in_year, pro_skill) VALUES (14, 'Agnella Petronis', 'apetronisd@timesonline.co.uk', '7x6RBUt', 'EMPLOYEE', null, 'java, sql');
INSERT INTO jdbc_test.account_user (user_id, full_name, email, password, role, exp_in_year, pro_skill) VALUES (15, 'Cazzie Lalor', 'clalore@senate.gov', 'Ss2Gf9Gl0a', 'EMPLOYEE', null, 'java, sql');
