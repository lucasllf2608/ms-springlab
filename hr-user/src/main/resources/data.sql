INSERT INTO tb_user (name, email, password) values ('Nina Brown', 'nina@gmail.com', '$2a$12$7haZBe6cRfnVmguVIT8dXem45Opg8nGuRf9yh3GuaVAjUPGzLRSyy');
INSERT INTO tb_user (name, email, password) values ('Leila Red', 'leila@gmail.com', '$2a$12$7haZBe6cRfnVmguVIT8dXem45Opg8nGuRf9yh3GuaVAjUPGzLRSyy');
 
insert into tb_role (role_name) values ('ROLE_OPERATION');
insert into tb_role (role_name) values ('ROLE_ADMIN');


insert into tb_user_role (user_id, role_id) values (1, 1);
insert into tb_user_role (user_id, role_id) values (2, 1);
insert into tb_user_role (user_id, role_id) values (2, 2); 