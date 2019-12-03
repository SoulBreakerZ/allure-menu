/* Populate table project */
INSERT INTO project (name, description,image_path,created_date) VALUES('SG-BATCH','Is reporting site build with allure-report',null,now());
INSERT INTO project (name, description,image_path,created_date) VALUES('SG-ADMIN','Is reporting site build with allure-report',null,now());
INSERT INTO project (name, description,image_path,created_date) VALUES('SG-CITIMANAGER','Is reporting site build with allure-report',null,now());
INSERT INTO project (name, description,image_path,created_date) VALUES('SG-INTERFACES','Is reporting site build with allure-report',null,now());

/* Populate table branch */

/* SG-BATCH DATA */
INSERT INTO branch (name,project_id,created_date) VALUES('develop', 1,now());
INSERT INTO branch (name,project_id,created_date) VALUES('testing', 1,now());
INSERT INTO branch (name,project_id,created_date) VALUES('master', 1,now());

/* SG-ADMIN DATA */
INSERT INTO branch (name,project_id,created_date) VALUES('develop', 2,now());
INSERT INTO branch (name,project_id,created_date) VALUES('testing', 2,now());
INSERT INTO branch (name,project_id,created_date) VALUES('master', 2,now());

/* SG-INTERFACES */
INSERT INTO branch (name,project_id,created_date) VALUES('develop', 3,now());
INSERT INTO branch (name,project_id,created_date) VALUES('testing', 3,now());
INSERT INTO branch (name,project_id,created_date) VALUES('master', 3,now());

/* SG-CITIMANAGER */
INSERT INTO branch (name,project_id,created_date) VALUES('develop', 4,now());
INSERT INTO branch (name,project_id,created_date) VALUES('testing', 4,now());
INSERT INTO branch (name,project_id,created_date) VALUES('master', 4,now());

/* Populate table project_branch */
INSERT INTO test_project (name, path, description,project_id,branch_id,created_date) VALUES('SG-BATCH REPORT TEST SITE', '/sg-batch','Is reporting site build with allure-report', 1,2,now());
INSERT INTO test_project (name, path, description,project_id,branch_id,created_date) VALUES('SG-ADMIN REPORT TEST SITE', '/sg-admin','Is reporting site build with allure-report',2,4,now());
INSERT INTO test_project (name, path, description,project_id,branch_id,created_date) VALUES('SG-CITIMANAGER REPORT TEST SITE', '/sg-citimanager','Is reporting site build with allure-report',3,6,now());
INSERT INTO test_project (name, path, description,project_id,branch_id,created_date) VALUES('SG-INTERFACES REPORT TEST SITE', '/sg-interfaces','Is reporting site build with allure-report',4,8,now());