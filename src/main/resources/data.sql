-- USER
INSERT INTO zoos_db.user (id, email, first_name, is_banned, last_name, password, role) VALUES (1, 'odmen@gmail.com', 'Teo', false, 'Hrabovenskyi', '$2a$12$LHdyP3GgXuVn40NzhFqh0.E20HK.ICp.85GIpnte6WMdUnNrezBCO', 'ADMIN');
INSERT INTO zoos_db.user (id, email, first_name, is_banned, last_name, password, role) VALUES (39, 'hankstom@gmail.com', 'Теодор', false, 'Грабовенський', '$2a$10$iT85tmIRfiucdwVUrHvxRezYfPZgPemhAM.DxzLjuUuBAn2jpsffq', 'USER');
INSERT INTO zoos_db.user (id, email, first_name, is_banned, last_name, password, role) VALUES (40, 'teodorgrab2002@gmail.com', 'Теодор', false, 'Грабовенський', '$2a$10$w0HyHmgrds1vaVwDkKkQVueIm4I86PsU01cmKhCLjpeD5auxIBuOC', 'USER');

-- ZOO
INSERT INTO zoos_db.zoo (id, entrance_fee, name, num_of_animals, num_of_visitors, type) VALUES (1, 166, 'New zoo', 34, 122, 'MEDIUM');
INSERT INTO zoos_db.zoo (id, entrance_fee, name, num_of_animals, num_of_visitors, type) VALUES (2, 24, 'Saint Louis Zoo', 56, 678, 'BIG');
INSERT INTO zoos_db.zoo (id, entrance_fee, name, num_of_animals, num_of_visitors, type) VALUES (3, 16, 'Bronx Zoo', 33, 3456, 'BIG');
INSERT INTO zoos_db.zoo (id, entrance_fee, name, num_of_animals, num_of_visitors, type) VALUES (4, 15, 'Denver Zoo', 12, 344, 'MEDIUM');
INSERT INTO zoos_db.zoo (id, entrance_fee, name, num_of_animals, num_of_visitors, type) VALUES (5, 35, 'Houston Zoo', 103, 567, 'MEDIUM');
INSERT INTO zoos_db.zoo (id, entrance_fee, name, num_of_animals, num_of_visitors, type) VALUES (6, 33, 'Brookfield Zoo', 87, 33, 'SMALL');
INSERT INTO zoos_db.zoo (id, entrance_fee, name, num_of_animals, num_of_visitors, type) VALUES (7, 29, 'Woodland Park Zoo', 56, 56, 'SMALL');
INSERT INTO zoos_db.zoo (id, entrance_fee, name, num_of_animals, num_of_visitors, type) VALUES (10, 16, 'New zoo', 34, 122, 'MEDIUM');
INSERT INTO zoos_db.zoo (id, entrance_fee, name, num_of_animals, num_of_visitors, type) VALUES (13, 100, 'Wow, Veres kruto', 1, 10000, 'MEDIUM');