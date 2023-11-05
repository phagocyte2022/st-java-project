INSERT INTO jc_street (street_code, street_name) VALUES
(1, 'Garden street'),
(2, '5-th avenue'),
(3, 'Workers street'),
(4, 'Apple street'),
(5, 'Veterans avenue');

INSERT INTO jc_university (university_id, university_name) VALUES
(1, 'OXFORD'),
(2, 'HARVARD'),
(3, 'YALE');


INSERT INTO jc_country_struct (area_id, area_name) VALUES
('010000000000', 'Settlement'),
('010010000000', 'Settlement District 1'),
('010020000000', 'Settlement district 2'),
('010030000000', 'Settlement district 3'),
('010040000000', 'Settlement district 4'),

('020000000000', 'province'),
('020010000000', 'province region 1'),
('020010010000', 'province region 1 district 1'),
('020010010001', 'province region 1 district 1 Settlement 1'),
('020010010002', 'province region 1 district 1 Settlement 2'),
('020010020000', 'province region 1 district 2'),
('020010020001', 'province region 1 district 2 Settlement 1'),
('020010020002', 'province region 1 district 2 Settlement 2'),
('020010020003', 'province region 1 district 2 Settlement 3'),
('020020000000', 'province region 2'),
('020020010000', 'province region 2 district 1'),
('020020010001', 'province region 2 district 1 Settlement 1'),
('020020010002', 'province region 2 district 1 Settlement 2'),
('020020010003', 'province region 2 district 1 Settlement 2'),
('020020020000', 'province region 2 district 2'),
('020020020001', 'province region 2 district 2 Settlement 1'),
('020020020002', 'province region 2 district 2 Settlement 2');

INSERT INTO jc_passport_office (p_office_id, p_office_area_id, p_office_name)
VALUES
(1, '010010000000', 'passport office district 1 Settlement'),
(2, '010020000000', 'passport office 1 district 2 Settlement'),
(3, '010020000000', 'passport office 2 district 2 Settlement'),
(4, '010010000000', 'passport office district 3 Settlement'),
(5, '020010010001', 'passport office region 1 Settlement 1'),
(6, '020010020002', 'passport office region 1 Settlement 2'),
(7, '020020010000', 'passport office region 2 district 1'),
(8, '020020020000', 'passport office region 2 district 2');

INSERT INTO jc_register_office (r_office_id, r_office_area_id, r_office_name) VALUES
(1, '010010000000', 'registration office 1  1 Settlement'),
(2, '010010000000', 'registration office 2 district 1 Settlement'),
(3, '010020000000', 'registration office district 2 Settlement'),
(4, '020010010001', 'registration office region 1 Settlement 1'),
(5, '020010020002', 'registration office region 1 Settlement 2'),
(6, '020020010000', 'registration office region 2 Settlement 1'),
(7, '020020020000', 'registration office region 2 Settlement 2');

